package com.miserableasf.thepeak;

import com.miserableasf.thepeak.entity.EntityInit;
import com.miserableasf.thepeak.entity.ThePeakEntity;
import com.miserableasf.thepeak.entity.client.ModModelLayers;
import com.miserableasf.thepeak.entity.client.ThePeakModel;
import com.miserableasf.thepeak.entity.client.ThePeakRenderer;
import com.miserableasf.thepeak.item.EggItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThePeak implements ModInitializer {
	public static final String MOD_ID = "the_peak";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		EntityInit.registerEntities();
		EggItems.load();
		ThePeakSounds.registerSounds();

		EntityRendererRegistry.register(EntityInit.THE_PEAK, ThePeakRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.THE_PEAK_LAYER, ThePeakModel::getTexturedModelData);

		FabricDefaultAttributeRegistry.register(EntityInit.THE_PEAK, ThePeakEntity.createAttributes());

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
			entries.add(EggItems.THE_PEAK_SPAWN_EGG);
		});
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}