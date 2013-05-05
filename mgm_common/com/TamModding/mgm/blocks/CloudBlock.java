package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;

public class CloudBlock extends BlocksBase {

    public CloudBlock(int par1) {
        super(par1, Material.cloth);
        super.registerTexture("CloudBlock");
        this.setHardness(1.0F);
        this.setResistance(1.0F);
        this.setStepSound(soundClothFootstep);
    }
   
}
