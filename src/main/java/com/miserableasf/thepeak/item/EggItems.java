package com.miserableasf.thepeak.item;

import com.miserableasf.thepeak.ThePeak;
import com.miserableasf.thepeak.entity.EntityInit;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EggItems {
    public static final Item THE_PEAK_SPAWN_EGG = register("the_peak_spawn_egg", new SpawnEggItem(EntityInit.THE_PEAK,
            9804699,
            7969893,
            new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ThePeak.id(name), item);
    }

    public static void load() {

    }
}
