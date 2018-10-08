package com.sainushi.mythrilmod.items.tools;

import com.sainushi.mythrilmod.Main;
import com.sainushi.mythrilmod.init.ItemsInit;
import com.sainushi.mythrilmod.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 21.0F, -3.2F);
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
