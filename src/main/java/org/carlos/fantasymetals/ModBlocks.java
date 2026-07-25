package org.carlos.fantasymetals;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModBlocks {
    public static final Block RUBY_ORE = new Block(Block.Settings.copy(Blocks.STONE).strength(1.5f, 1.0f).sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, Identifier.of("fantasymetals", "ruby_ore"), RUBY_ORE);
    }
}
