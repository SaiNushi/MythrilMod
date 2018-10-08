package com.sainushi.mythrilmod.items;

import com.sainushi.mythrilmod.Main;
import com.sainushi.mythrilmod.init.ItemsInit;
import com.sainushi.mythrilmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mythriltab);
		
		ItemsInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
