package com.sainushi.mythrilmod.util.handlers;

import com.sainushi.mythrilmod.init.BlocksInit;
import com.sainushi.mythrilmod.init.ItemsInit;
import com.sainushi.mythrilmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemsInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlocksInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for(Item item : ItemsInit.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}

		}
		
		for(Block block : BlocksInit.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}

		}
	}
}
