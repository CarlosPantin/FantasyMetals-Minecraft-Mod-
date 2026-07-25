package org.carlos.fantasymetals;

import net.fabricmc.api.ModInitializer;
import org.carlos.fantasymetals.block.ModBlocks;
import org.carlos.fantasymetals.item.ModItems;

public class Fantasymetals implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
