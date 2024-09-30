package me.jtech.fdp;

import eu.midnightdust.lib.config.MidnightConfig;
import me.jtech.fdp.Implementations.FDPMidnightConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricDefaultProject implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fdp"); // Setup a logger

    @Override
    public void onInitialize() {
        LOGGER.info("Starting FDP main mod"); // Send a startup message to the logs

        /*
            Do whatever setup needs doing here
         */

        LOGGER.info("Setting up FDP configs"); // Send a message to the logs telling it we are setting up configs
        MidnightConfig.init("fdp", FDPMidnightConfig.class); // Initialise MidnightConfig
    }
}
