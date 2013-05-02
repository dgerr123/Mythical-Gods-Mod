package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;

public class OlympusPillar extends BlocksBase {

    public OlympusPillar(int par1) {
        super(par1, Material.rock);
        super.registerTexture("OlympusPillarSide", "OlympusPillarTop",
                "OlympusPillarBottom");
        this.setHardness(3.0F);
        this.setResistance(10.0F);
    }


}