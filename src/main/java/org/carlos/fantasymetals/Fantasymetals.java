package org.carlos.fantasymetals;

import net.fabricmc.api.ModInitializer;

public class Fantasymetals implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
