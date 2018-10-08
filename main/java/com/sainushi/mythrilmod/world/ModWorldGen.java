package com.sainushi.mythrilmod.world;

import java.util.Random;

import com.sainushi.mythrilmod.init.BlocksInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0) 
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == -1) 
		{
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == 1) 
		{
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		generateOre(BlocksInit.MARBLE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 255, random.nextInt(32) + 16, 8);
		generateOre(BlocksInit.GREEN_MARBLE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 255, random.nextInt(32) + 16, 8);
		generateOre(BlocksInit.BLACK_MARBLE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 255, random.nextInt(32) + 16, 8);
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		generateOre(BlocksInit.MYTHRIL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 32, random.nextInt(8) + 2, 4);
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{

	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;
		
		
		if (world.provider.getDimension() == 0) 
		{
			for (int i = 0; i < chances; i++) 
			{
				BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
				WorldGenMinable generator = new WorldGenMinable(ore, size);
				generator.generate(world, random, pos);
			}
		}
		
		if (world.provider.getDimension() == -1) 
		{
			for (int i = 0; i < chances; i++) 
			{
				BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
				WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.NETHERRACK));
				generator.generate(world, random, pos);
			}
		}
		
		if (world.provider.getDimension() == 1) 
		{
			for (int i = 0; i < chances; i++) 
			{
				BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
				WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.END_STONE));
				generator.generate(world, random, pos);
			}
		}
	}
	
}
