package com.sainushi.mythrilmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MythrilOre extends BlockBase 
{

	public MythrilOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(2.0F);
	//	setLightOpacity(1);
	//	setBlockUnbreakable();
	}
	
	//change item drop
	//@Override
	//public Item getItemDropped(IBlockState state, Random rand, int fortune){
	//return ItemsInit.MYTHRIL_INGOT;
	//or return ITEMS.DIAMOND;
	//}

	//drop quantity
	//@Override
	//public int quantityDropped(Random rand){
	//	return #; drops that number
	//	for a random amount
	//	int max = 4;
	//	int min = 1;
	//	return rand.nextInt(max) + min;
	//}
}
