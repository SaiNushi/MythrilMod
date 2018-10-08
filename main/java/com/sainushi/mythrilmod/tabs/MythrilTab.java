package com.sainushi.mythrilmod.tabs;

import com.sainushi.mythrilmod.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythrilTab extends CreativeTabs{
	public MythrilTab(String label) {
		super("mythriltab");
		//this.setBackgroundImageName("name.png");
		//call image tab_name.png
	}
	public ItemStack getTabIconItem() { return new ItemStack(ItemsInit.MYTHRIL_INGOT);}
	
}
