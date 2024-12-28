package com.example.stevesaga.init;

import com.example.stevesaga.objects.blocks.BlockCondensedLightStone;
import com.example.stevesaga.objects.blocks.BlockCondensedRainbowStone;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModBlocks {
    public static final Block CONDENSED_RAINBOW_STONE = new BlockCondensedRainbowStone();
    public static final Block CONDENSED_LIGHT_STONE = new BlockCondensedLightStone();

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            CONDENSED_RAINBOW_STONE,
            CONDENSED_LIGHT_STONE
        );
    }

    @SubscribeEvent
    public static void onItemBlockRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new ItemBlock(CONDENSED_RAINBOW_STONE).setRegistryName(CONDENSED_RAINBOW_STONE.getRegistryName()),
            new ItemBlock(CONDENSED_LIGHT_STONE).setRegistryName(CONDENSED_LIGHT_STONE.getRegistryName())
        );
    }
}