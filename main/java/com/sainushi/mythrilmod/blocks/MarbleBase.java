package com.sainushi.mythrilmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MarbleBase extends BlockBase {

	public MarbleBase(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
	//	setLightLevel(2.0F);
	//	setLightOpacity(1);
	//	setBlockUnbreakable();
	}

}
