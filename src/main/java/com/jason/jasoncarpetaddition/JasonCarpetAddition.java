package com.jason.jasoncarpetaddition;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class JasonCarpetAddition implements ModInitializer, CarpetExtension {
    public static final String MOD_ID = "jason_carpet_addition";
    public static final String MOD_NAME = "Jason Carpet Addition";
    public static final String VERSION = "1.0.0";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        CarpetServer.manageExtension(this);
        LOGGER.info("Registered Carpet extension {}", MOD_NAME);
    }

    @Override
    public void onGameStarted() {
        CarpetServer.settingsManager.parseSettingsClass(JasonCarpetSettings.class);
        LOGGER.info("Loaded {}", MOD_NAME);
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        return JasonTranslations.getTranslation(lang);
    }

    @Override
    public String version() {
        return VERSION;
    }
}
