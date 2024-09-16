package com.miserableasf.thepeak;

import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ThePeakSounds {
    public static final SoundEvent THATS_MY_SHOULDER = registerSoundEvent("thats_my_shoulder");
    public static final SoundEvent DEATH_SOUND = registerSoundEvent("death_sound");
    public static final SoundEvent THE_PEAK = registerSoundEvent("the_peak");

//    death_sound -> 2 момент из зет май шоулдер
//    the_peak -> womp womp
//    зет май шолден -> ну тоже самое

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(ThePeak.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        ThePeak.LOGGER.info("Registering Sounds for " + ThePeak.MOD_ID);
    }
}
