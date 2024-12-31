package com.wazzap.stevesaga.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import com.wazzap.stevesaga.items.ItemBase;
import com.wazzap.stevesaga.items.tools.ToolAxe;
import com.wazzap.stevesaga.items.tools.ToolHoe;
import com.wazzap.stevesaga.items.tools.ToolPickaxe;
import com.wazzap.stevesaga.items.tools.ToolSpade;
import com.wazzap.stevesaga.items.tools.ToolSword;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//To add in new items, just copy the line below
	public static final Item RAINBOW_STONE = new ItemBase("rainbow_stone");
	public static final Item LIGHT_STONE = new ItemBase("light_stone");
	
	//To add in new material types (for Tools), just copy the line below
	public static final ToolMaterial MATERIAL_RAINBOW_STONE = EnumHelper.addToolMaterial("material_rainbow_stone", 1, 2500, 12.0F, 4.0F, 22);
	public static final ToolMaterial MATERIAL_LIGHT_STONE = EnumHelper.addToolMaterial("material_light_stone", 1, 1561, 8.0F, 3.0F, 10);
	
	//Tools
	public static final ItemSword RAINBOW_SWORD = new ToolSword("rainbow_sword", MATERIAL_RAINBOW_STONE);
	public static final ItemPickaxe RAINBOW_PICKAXE = new ToolPickaxe("rainbow_pickaxe", MATERIAL_RAINBOW_STONE);
	public static final ItemAxe RAINBOW_AXE = new ToolAxe("rainbow_axe", MATERIAL_RAINBOW_STONE);
	public static final ItemSpade RAINBOW_SHOVEL = new ToolSpade("rainbow_shovel", MATERIAL_RAINBOW_STONE);
	public static final ItemHoe RAINBOW_HOE = new ToolHoe("rainbow_hoe", MATERIAL_RAINBOW_STONE);
	//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
	public static final ItemSword LIGHT_SWORD = new ToolSword("light_sword", MATERIAL_LIGHT_STONE);
	public static final ItemPickaxe LIGHT_PICKAXE = new ToolPickaxe("light_pickaxe", MATERIAL_LIGHT_STONE);
	public static final ItemAxe LIGHT_AXE = new ToolAxe("light_axe", MATERIAL_LIGHT_STONE);
	public static final ItemSpade LIGHT_SHOVEL = new ToolSpade("light_shovel", MATERIAL_LIGHT_STONE);
	public static final ItemHoe LIGHT_HOE = new ToolHoe("light_hoe", MATERIAL_LIGHT_STONE);
	
}