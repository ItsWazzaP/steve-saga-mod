package com.example.stevesaga.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCondensedRainbowStone extends Block {
    public BlockCondensedRainbowStone() {
        super(Material.ROCK);
        setRegistryName("condensed_rainbow_stone");
        setUnlocalizedName("condensed_rainbow_stone");
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
    }
}