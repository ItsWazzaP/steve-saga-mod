package com.wazzap.stevesaga.tabs;

import com.wazzap.stevesaga.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class SteveSagaTab extends CreativeTabs
{
	public SteveSagaTab(String label)
	{
		super("stevesagatab");
		this.setBackgroundImageName("items.png");
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.RAINBOW_STONE);
	}
}
