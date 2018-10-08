package com.sainushi.mythrilmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesInit {
	public static void init() {
		//GameRegistry.addSmelting(ModItems.Ruby, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F); 
		//GameRegistry.addSmelting(ModBlocks.Ruby_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCKS, 1), 3.0F);
		GameRegistry.addSmelting(BlocksInit.MYTHRIL_ORE, new ItemStack(ItemsInit.MYTHRIL_INGOT, 1), 1.5F);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 1.0F);
	}
}
