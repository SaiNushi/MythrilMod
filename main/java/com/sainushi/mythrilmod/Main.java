package com.sainushi.mythrilmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.sainushi.mythrilmod.init.RecipesInit;
import com.sainushi.mythrilmod.tabs.MythrilTab;
import com.sainushi.mythrilmod.util.Reference;
import com.sainushi.mythrilmod.util.proxy.CommonProxy;
import com.sainushi.mythrilmod.world.ModWorldGen;

@Mod(modid = Reference.MOD_ID, name=Reference.NAME, version = Reference.VERSION)
public class Main {
	public static final CreativeTabs mythriltab = new MythrilTab("mythriltab");

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RecipesInit.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
}
