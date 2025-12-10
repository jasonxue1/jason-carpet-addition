package com.jason.jasoncarpetaddition;

import carpet.api.settings.Rule;

import static carpet.api.settings.RuleCategory.SURVIVAL;

public class JasonCarpetSettings {
    public static final String JASON = "jason";

    @Rule(
        categories = {JASON, SURVIVAL}
    )
    public static boolean pearlIgnoreEntityCollision = false;
}
