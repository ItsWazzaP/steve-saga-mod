package main.java.com.wazzap.stevesaga.items;

import main.java.com.wazzap.stevesaga.Main;
import main.java.com.wazzap.stevesaga.init.ModItems;
import main.java.com.wazzap.stevesaga.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
