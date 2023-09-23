package com.skitbet.dogos.common.init;

import com.skitbet.dogos.common.DogosMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class DogosItems {

    public static Item GERMAN_SHEPHERD_SPAWN_EGG;
    public static Item BISCUIT;

    public static void init() {
        GERMAN_SHEPHERD_SPAWN_EGG = registerItem("german_shepherd_spawn_egg",
                new SpawnEggItem(DogosEntities.GERMAN_SHEPHERD, 0x522b13, 0xb57f5e,
                        new FabricItemSettings()), ItemGroups.SPAWN_EGGS);

        BISCUIT = registerItem("biscuit",
                new Item(new Item.Settings()), ItemGroups.FOOD_AND_DRINK);
    }

    public static Item registerItem(String name, Item item, ItemGroup group) {
        Registry.register(Registries.ITEM, DogosMod.MODID + ":" + name, item);
        if (group != null) {
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }
        return item;
    }
}
