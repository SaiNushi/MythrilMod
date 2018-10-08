package com.sainushi.mythrilmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MythrilBlock extends BlockBase 
{

	public MythrilBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(10.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(2.0F);
	//	setLightOpacity(1);
	//	setBlockUnbreakable();
	}

}
