package com.miserableasf.thepeak.entity;

import com.miserableasf.thepeak.ThePeak;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntityInit {
    public static EntityType<ThePeakEntity> THE_PEAK;

    public static void registerEntities() {
        THE_PEAK = Registry.register(
                Registries.ENTITY_TYPE,
                Identifier.of(ThePeak.MOD_ID, "the_peak"),
                EntityType.Builder.create(ThePeakEntity::new, SpawnGroup.CREATURE)
                        .dimensions(1.0f,1.0f)
                        .build()
        );
    }
}