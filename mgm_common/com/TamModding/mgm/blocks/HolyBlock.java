package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;

public class HolyBlock extends BlocksBase {

    public HolyBlock(int par1) {
        super(par1, Material.iron);
        super.registerTexture("HolyBlock");
        this.setHardness(10.0F);
        this.setResistance(10.0F);
    }
}
