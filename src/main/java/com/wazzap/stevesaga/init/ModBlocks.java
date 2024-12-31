package main.java.com.wazzap.stevesaga.init;

import java.util.ArrayList;
import java.util.List;

import main.java.com.wazzap.stevesaga.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CONDENSED_RAINBOW_STONE = new BlockBase("condensed_rainbow_stone", Material.IRON);
	public static final Block CONDENSED_LIGHT_STONE = new BlockBase("condensed_light_stone", Material.IRON);

}
