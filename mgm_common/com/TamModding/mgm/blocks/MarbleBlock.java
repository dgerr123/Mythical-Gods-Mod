package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;

public class MarbleBlock extends BlocksBase {

    public MarbleBlock(int par1) {
        super(par1, Material.rock);
        super.registerTexture("MarbleBlock");
        this.setHardness(3.0F);
        this.setResistance(10.0F);
    }
    
}
