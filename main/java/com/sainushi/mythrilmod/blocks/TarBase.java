package com.sainushi.mythrilmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TarBase extends BlockBase{

	public TarBase(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.GROUND);
		setHardness(1.0F);
		setResistance(10.0F);
		setHarvestLevel("shovel", 0);
	//	setLightLevel(2.0F);
	//	setLightOpacity(1);
	//	setBlockUnbreakable();
	}

}
