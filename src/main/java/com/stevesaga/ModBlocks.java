package com.example.stevesaga;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block condensedLightStone;
    public static Block condensedRainbowStone;
    public static Block condensedNightmareStone;
    public static Block condensedDarkStone;

    public static void init() {
        condensedLightStone = new Block(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setRegistryName("condensed_light_stone").setUnlocalizedName("condensedLightStone");
        condensedRainbowStone = new Block(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setRegistryName("condensed_rainbow_stone").setUnlocalizedName("condensedRainbowStone");
        condensedNightmareStone = new Block(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setRegistryName("condensed_nightmare_stone").setUnlocalizedName("condensedNightmareStone");
        condensedDarkStone = new Block(Material.ROCK).setHardness(3.0F).setResistance(5.0F).setRegistryName("condensed_dark_stone").setUnlocalizedName("condensedDarkStone");

        GameRegistry.register(condensedLightStone);
        GameRegistry.register(condensedRainbowStone);
        GameRegistry.register(condensedNightmareStone);
        GameRegistry.register(condensedDarkStone);
    }
}