package com.wazzap.stevesaga.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RainbowSapling extends BlockBase
{
	public RainbowSapling(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(0.0F);
		setResistance(0.0F);
	}
}