package com.wazzap.stevesaga.init;

import java.util.ArrayList;
import java.util.List;

import com.wazzap.stevesaga.blocks.BlockBase;
import com.wazzap.stevesaga.blocks.CondensedRainbowStone;
import com.wazzap.stevesaga.blocks.CondensedLightStone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//To add in new blocks, just copy the line below
	//To connect the block with its block Java file, instead of new BlockBase(...) put new [BlockJavaFileName] etc.
	public static final Block CONDENSED_RAINBOW_STONE = new CondensedRainbowStone("condensed_rainbow_stone", Material.IRON);
	public static final Block CONDENSED_LIGHT_STONE = new CondensedLightStone("condensed_light_stone", Material.IRON);

}
