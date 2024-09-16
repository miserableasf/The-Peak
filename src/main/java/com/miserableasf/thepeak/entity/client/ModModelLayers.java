package com.miserableasf.thepeak.entity.client;

import com.miserableasf.thepeak.ThePeak;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer THE_PEAK_LAYER =
            new EntityModelLayer(Identifier.of(ThePeak.MOD_ID, "the_peak"), "main");
}
