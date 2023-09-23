package com.skitbet.dogos.common.init;

import com.skitbet.dogos.common.DogosMod;
import com.skitbet.dogos.common.blocks.BowlBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class DogosBlocks {

    public static Block WHITE_BOWL;
    public static Block BLUE_BOWL;
    public static Block RED_BOWL;
    public static Block AQUA_BOWL;
    public static Block GREEN_BOWL;
    public static Block ORANGE_BOWL;
    public static Block PINK_BOWL;
    public static Block YELLOW_BOWL;

    public static void init() {
        WHITE_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.WHITE).nonOpaque()), "white_bowl", ItemGroups.COLORED_BLOCKS);
        BLUE_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).nonOpaque()), "blue_bowl", ItemGroups.COLORED_BLOCKS);
        RED_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.RED).nonOpaque()), "red_bowl", ItemGroups.COLORED_BLOCKS);
        AQUA_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.LIGHT_BLUE).nonOpaque()), "aqua_bowl", ItemGroups.COLORED_BLOCKS);
        GREEN_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.GREEN).nonOpaque()), "green_bowl", ItemGroups.COLORED_BLOCKS);
        ORANGE_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.ORANGE).nonOpaque()), "orange_bowl", ItemGroups.COLORED_BLOCKS);
        PINK_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.PINK).nonOpaque()), "pink_bowl", ItemGroups.COLORED_BLOCKS);
        YELLOW_BOWL = registerBlock(new BowlBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.YELLOW).nonOpaque()), "yellow_bowl", ItemGroups.COLORED_BLOCKS);

    }

    private static Block registerBlock(Block block, String name, ItemGroup group) {
        Registry.register(Registries.BLOCK, DogosMod.MODID + ":" + name, block);

        if (group != null) {
            BlockItem item = new BlockItem(block, new Item.Settings());
            DogosItems.registerItem(name, item, group);
        }
        return block;
    }
}
