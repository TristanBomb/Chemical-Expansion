package com.tristanbomb.chemical_expansion.world;

import java.util.Random;

import com.tristanbomb.chemical_expansion.block.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			genOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}

	}

	private void genOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		genOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX*16, chunkZ*16, 32, 96, 4+random.nextInt(4), 10);
		genOre(ModBlocks.oreSilver.getDefaultState(), world, random, chunkX*16, chunkZ*16, 16, 48, 4+random.nextInt(4), 6);
		genOre(ModBlocks.oreLead.getDefaultState(), world, random, chunkX*16, chunkZ*16, 0, 32, 4+random.nextInt(4), 6);
	}
	
	private void genOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
