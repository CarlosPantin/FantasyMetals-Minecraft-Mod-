package org.carlos.fantasymetals;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItems {
    public static final Item RUBY = new Item(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, Identifier.of("fantasymetals", "ruby"), RUBY);
        Registry.register(Registries.ITEM, Identifier.of("fantasymetals", "ruby_ore"), new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings()));
    }
}
