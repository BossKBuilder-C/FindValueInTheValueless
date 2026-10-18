package com.bosskbuilder.findvalueinthevalueless;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostableRegistry;
import net.minecraft.resources.Identifier;

import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindValueInTheValueless implements ModInitializer {
	public static final String MOD_ID = "find-value-in-the-valueless";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		net.fabricmc.fabric.api.registry.CompostableRegistry.INSTANCE.add(
				net.minecraft.world.item.Items.ROTTEN_FLESH,
				0.3f
		);
		net.fabricmc.fabric.api.registry.CompostableRegistry.INSTANCE.add(
				Items.TROPICAL_FISH,
				0.3f
		);
		CompostableRegistry.INSTANCE.add(
				Items.HONEYCOMB,
				0.65f
		);
		CompostableRegistry.INSTANCE.add(
				Items.EGG,
				0.85f
		);
		CompostableRegistry.INSTANCE.add(
				Items.BROWN_EGG,
				0.85f
		);
		CompostableRegistry.INSTANCE.add(
				Items.BLUE_EGG,
				0.85f
		);
		CompostableRegistry.INSTANCE.add(
				Items.POISONOUS_POTATO,
				0.5f
		);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
