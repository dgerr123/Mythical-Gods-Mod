package com.TamModding.mgm.generation;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeMountOlympus extends BiomeGenBase {

    public BiomeMountOlympus(int par1) {
        super(par1);
        biomeName = "Mount Olympus";
        topBlock = (byte) Block.grass.blockID;
        fillerBlock = (byte) Block.dirt.blockID;
        minHeight = 0.0F;
        maxHeight = 5.0F;
    }

    @Override
    public int getBiomeGrassColor() {
        return 0x1AFF00;
    }

}
