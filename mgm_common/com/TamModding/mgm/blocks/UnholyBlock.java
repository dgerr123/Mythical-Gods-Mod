package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;

public class UnholyBlock extends BlocksBase {

    public UnholyBlock(int par1) {
        super(par1, Material.iron);
        super.registerTexture("UnholyBlock");
        this.setHardness(10.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundMetalFootstep);
    }
}
