package com.tarantulagaming.tech.registry;

import com.tarantulagaming.tech.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item CARBON_IMPURE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "carbon_impure"), CARBON_IMPURE);
    }
}
