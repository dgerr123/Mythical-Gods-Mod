package com.TamModding.mgm.generation;

import java.util.Random;
import com.TamModding.mgm.lib.BlockHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator{
    
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	 {
	 switch(world.provider.dimensionId)
	 {
	 case - 1: generateNether(world, random, chunkX * 16, chunkZ * 16);
	 case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
	 case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
	 }
	}
    
	
    
	private void generateNether(World world, Random random, int i, int j) {
		
	}



	private void generateEnd(World world, Random random, int i, int j) {
		
	}



	private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		
		
				for(int i = 0; i < 1; i++)
				{
					//16x16 area up to y = 64 
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(16);
				int randPosZ = chunkZ + rand.nextInt(16);
				//9 blocks per vein
				(new WorldGenMinable(BlockHelper.unholyOre.blockID, 3)).generate(world, rand,
				randPosX, randPosY, randPosZ);		
		   }	
		}
	{
{
	
	}
		}
			}