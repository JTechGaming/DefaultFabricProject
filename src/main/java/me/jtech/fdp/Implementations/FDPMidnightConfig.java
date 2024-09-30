package me.jtech.fdp.Implementations;

import eu.midnightdust.lib.config.MidnightConfig;

public class FDPMidnightConfig extends MidnightConfig {
    public static final String TEXT = "Example"; // an example category

    @Comment(category = TEXT, centered = true) public static Comment sText; // Some text
    @Comment(category = TEXT) public static Comment spacer; // A spacer
    @Entry(category = TEXT) public static boolean isEnabled = true; // Just a random bool value
}
