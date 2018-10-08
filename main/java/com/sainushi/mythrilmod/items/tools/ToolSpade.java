package com.sainushi.mythrilmod.items.tools;

import com.sainushi.mythrilmod.Main;
import com.sainushi.mythrilmod.init.ItemsInit;
import com.sainushi.mythrilmod.util.IHasModel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel{

	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
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
