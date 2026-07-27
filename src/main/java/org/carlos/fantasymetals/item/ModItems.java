package org.carlos.fantasymetals.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.HoeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.carlos.fantasymetals.block.ModBlocks;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings());

    public static final Item RUBY_SWORD = new SwordItem(
            ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.RUBY, 3, -2.4F)
            )
    );

    public static final Item RUBY_PICKAXE = new PickaxeItem(
            ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(
                    PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 1, -2.8F)
            )
    );

    public static final Item RUBY_AXE = new AxeItem(
            ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(
                    AxeItem.createAttributeModifiers(ModToolMaterials.RUBY, 2, -3.0F)
            )
    );

    public static final Item RUBY_SHOVEL = new ShovelItem(
            ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(
                    ShovelItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5F, -3.0F)
            )
    );

    public static final Item RUBY_HOE = new HoeItem(
            ModToolMaterials.RUBY,
            new Item.Settings().attributeModifiers(
                    HoeItem.createAttributeModifiers(ModToolMaterials.RUBY, 1.5F, -3.0F)
            )
    );

    public static void registerItems() {
        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby"),
                RUBY
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_sword"),
                RUBY_SWORD
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_ore"),
                new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings())
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_pickaxe"),
                RUBY_PICKAXE
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_axe"),
                RUBY_AXE
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_shovel"),
                RUBY_SHOVEL
        );

        Registry.register(
                Registries.ITEM,
                Identifier.of("fantasymetals", "ruby_hoe"),
                RUBY_HOE
        );
    }
}