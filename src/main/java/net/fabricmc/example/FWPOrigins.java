package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.registry.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FWPOrigins implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("fwporigins");

	public static  final  String MOD_ID = "fwporigins";

	@Override
	public void onInitialize() {
		Moditems.registerItems();
	}
}
