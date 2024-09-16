package com.miserableasf.thepeak.entity.client;

import com.miserableasf.thepeak.ThePeak;
import com.miserableasf.thepeak.entity.ThePeakEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ThePeakRenderer extends MobEntityRenderer<ThePeakEntity, ThePeakModel<ThePeakEntity>> {
    public ThePeakRenderer(EntityRendererFactory.Context context, ThePeakModel<ThePeakEntity> entityModel, float f) {
        super(context, entityModel, f);
    }

    public ThePeakRenderer(EntityRendererFactory.Context context) {
        super(context, new ThePeakModel<>(context.getPart(ModModelLayers.THE_PEAK_LAYER)), 0.6f);
    }

    @Override
    public Identifier getTexture(ThePeakEntity entity) {
        return Identifier.of(ThePeak.MOD_ID, "textures/entity/the_peak.png");
    }

    @Override
    public void render(ThePeakEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
