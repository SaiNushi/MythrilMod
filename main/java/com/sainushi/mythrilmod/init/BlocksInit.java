package com.sainushi.mythrilmod.init;

import java.util.ArrayList;
import java.util.List;

import com.sainushi.mythrilmod.blocks.BlockBase;
import com.sainushi.mythrilmod.blocks.MarbleBase;
import com.sainushi.mythrilmod.blocks.MythrilBlock;
import com.sainushi.mythrilmod.blocks.MythrilOre;
import com.sainushi.mythrilmod.blocks.StoneBase;
import com.sainushi.mythrilmod.blocks.TarBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksInit 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MYTHRIL_BLOCK = new MythrilBlock("mythril_block", Material.IRON);
	public static final Block MYTHRIL_ORE = new MythrilOre("mythril_ore", Material.ROCK);
	
	public static final Block BLACK_MARBLE = new MarbleBase("black_marble", Material.ROCK);
	public static final Block GREEN_MARBLE = new MarbleBase("green_marble", Material.ROCK);
	public static final Block MARBLE = new MarbleBase("marble", Material.ROCK);
	
	public static final Block TAR = new TarBase("tar", Material.CLAY);
	
	public static final Block BEIGE_STONE = new StoneBase("beige_stone", Material.ROCK);
	public static final Block BLACK_STONE = new StoneBase("black_stone", Material.ROCK);
	public static final Block ROUGE_STONE = new StoneBase("rouge_stone", Material.ROCK);
	public static final Block BLUE_STONE = new StoneBase("blue_stone", Material.ROCK);
	public static final Block CREAM_STONE = new StoneBase("cream_stone", Material.ROCK);
	public static final Block DARK_STONE = new StoneBase("dark_stone", Material.ROCK);
	public static final Block GREEN_STONE = new StoneBase("green_stone", Material.ROCK);
	public static final Block PURPLE_STONE = new StoneBase("purple_stone", Material.ROCK);
	public static final Block TAN_STONE = new StoneBase("tan_stone", Material.ROCK);
	public static final Block WHITE_STONE = new StoneBase("white_stone", Material.ROCK);
	public static final Block BROWN_STONE = new StoneBase("brown_stone", Material.ROCK);
	public static final Block CYAN_STONE = new StoneBase("cyan_stone", Material.ROCK);
	public static final Block RAZ_STONE = new StoneBase("raz_stone", Material.ROCK);
}
