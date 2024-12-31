package com.wazzap.stevesaga.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CondensedRainbowStone extends BlockBase
{

	public CondensedRainbowStone(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(4.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}