package com.sainushi.mythrilmod.blocks;

import com.sainushi.mythrilmod.Main;
import com.sainushi.mythrilmod.init.BlocksInit;
import com.sainushi.mythrilmod.init.ItemsInit;
import com.sainushi.mythrilmod.tabs.MythrilTab;
import com.sainushi.mythrilmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.mythriltab);
		
		BlocksInit.BLOCKS.add(this);
		ItemsInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}
