package com.wazzap.stevesaga.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CondensedLightStone extends BlockBase
{

	public CondensedLightStone(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(4.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}