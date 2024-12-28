package com.example.stevesaga.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCondensedLightStone extends Block {
    public BlockCondensedLightStone() {
        super(Material.ROCK);
        setRegistryName("condensed_light_stone");
        setUnlocalizedName("condensed_light_stone");
        setHardness(5.0F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
    }
}