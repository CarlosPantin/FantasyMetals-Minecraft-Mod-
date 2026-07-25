package org.carlos.fantasymetals;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModBlocks {
    public static final Block RUBY_ORE = new ExperienceDroppingBlock(
            UniformIntProvider.create(1, 4),
            Block.Settings.copy(Blocks.STONE).strength(3.0f, 3.0f).sounds(BlockSoundGroup.STONE).requiresTool()
    );

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of("fantasymetals", "ruby_ore"), RUBY_ORE);
    }
}