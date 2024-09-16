package com.miserableasf.thepeak.entity;

import com.miserableasf.thepeak.ThePeak;
import com.miserableasf.thepeak.ThePeakSounds;
import com.miserableasf.thepeak.entity.ai.ThePeakAttackGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ThePeakEntity extends PathAwareEntity {
    private static final TrackedData<Boolean> ATTACKING = DataTracker.registerData(ThePeakEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Boolean> DAMAGED = DataTracker.registerData(ThePeakEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public AnimationState idleAnimationState = new AnimationState();
    public AnimationState attackAnimationState = new AnimationState();

    private int idleAnimationTimeout = 0;
    private int attackAnimationTimeout = 0;

    public ThePeakEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 55;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
        if (this.isAttacking()) {
            if (attackAnimationTimeout <= 0) {
                attackAnimationTimeout = 30;
                this.attackAnimationState.start(this.age);
            } else {
                attackAnimationTimeout--;
            }
        } else {
            this.attackAnimationState.stop();
        }
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ThePeakSounds.THATS_MY_SHOULDER;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ThePeakSounds.DEATH_SOUND;
    }

    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(ATTACKING, false);
        builder.add(DAMAGED, false);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new ThePeakAttackGoal(this, 1D, true));

        this.goalSelector.add(2, new WanderAroundGoal(this, 1D));

        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.goalSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));

        this.targetSelector.add(1, new RevengeGoal(this, PlayerEntity.class));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return PathAwareEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 1.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 15.0)
                .add(EntityAttributes.GENERIC_STEP_HEIGHT, 1.0);
    }
}
