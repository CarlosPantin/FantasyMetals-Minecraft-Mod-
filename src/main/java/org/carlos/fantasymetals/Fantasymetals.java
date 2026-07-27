package org.carlos.fantasymetals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import org.carlos.fantasymetals.block.ModBlocks;
import org.carlos.fantasymetals.item.ModItems;
import org.carlos.fantasymetals.worldgen.ModPlacedFeatures;

public class Fantasymetals implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();

        BiomeModifications.addFeature(
                BiomeSelectors.all(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.RUBY_ORE_PLACED_KEY
        );
    }
}