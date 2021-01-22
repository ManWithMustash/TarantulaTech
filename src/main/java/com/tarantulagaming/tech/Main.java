package com.tarantulagaming.tech;

import com.tarantulagaming.tech.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "ttech";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
