package me.jtech.fdp.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricDefaultProjectClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fdp");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Starting FDP client mod");
    }
}