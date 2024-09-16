package com.miserableasf.thepeak.entity.ai;

import com.miserableasf.thepeak.ThePeakSounds;
import com.miserableasf.thepeak.entity.ThePeakEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Hand;

public class ThePeakAttackGoal extends MeleeAttackGoal {
    private final ThePeakEntity entity;
    private int attackDelay = 30;
    private int ticksUntilNextAttack = 30;
    private boolean shouldCountTillNextAttack = false;

    public ThePeakAttackGoal(PathAwareEntity mob, double speed, boolean pauseWhenMobIdle) {
        super(mob, speed, pauseWhenMobIdle);
        entity = ((ThePeakEntity) mob);
    }

    @Override
    public void start() {
        super.start();
        attackDelay = 30;
        ticksUntilNextAttack = 30;
    }

    @Override
    protected void attack(LivingEntity enemy) {
        if (isEnemyWithinAttackDistance(enemy)) {
            shouldCountTillNextAttack = true;

            if (isTimeToStartAttackAnimation()) {
                entity.attackAnimationState.start(entity.age);
            }

            if (isTimeToAttack()) {
                this.mob.getLookControl().lookAt(enemy.getX(), enemy.getEyeY(), enemy.getZ());
                performAttack(enemy);
            }
        } else {
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            entity.attackAnimationState.stop();
        }
    }



    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy) {
        return this.entity.distanceTo(pEnemy) <= 2f;
    }

    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.getTickCount(attackDelay * 2);
    }

    protected boolean isTimeToStartAttackAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }

    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swingHand(Hand.MAIN_HAND);
        this.mob.tryAttack(pEnemy);
        this.mob.playSound(ThePeakSounds.THE_PEAK, 1.0f, 1.0f);
    }

    @Override
    public void tick() {
        super.tick();
        if(shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }

}
