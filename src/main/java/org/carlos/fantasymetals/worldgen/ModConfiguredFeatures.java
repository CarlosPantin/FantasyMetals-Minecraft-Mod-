package org.carlos.fantasymetals.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.carlos.fantasymetals.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of("fantasymetals", "ruby_ore"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        List<OreFeatureConfig.Target> targets = List.of(
                OreFeatureConfig.createTarget(
                        new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.RUBY_ORE.getDefaultState()
                )
        );

        context.register(RUBY_ORE_KEY, new ConfiguredFeature<>(
                Feature.ORE,
                new OreFeatureConfig(targets, 6)
        ));
    }
}