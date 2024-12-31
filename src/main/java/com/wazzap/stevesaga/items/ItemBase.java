package com.wazzap.stevesaga.items;

import com.wazzap.stevesaga.Main;
import com.wazzap.stevesaga.init.ModItems;
import com.wazzap.stevesaga.tabs.SteveSagaTab;
import com.wazzap.stevesaga.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.STEVESAGATAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}