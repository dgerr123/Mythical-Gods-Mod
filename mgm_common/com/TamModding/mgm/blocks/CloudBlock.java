package com.TamModding.mgm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class CloudBlock extends BlocksBase {

    public CloudBlock(int par1) {
        super(par1, Material.cloth);
        super.registerTexture("CloudBlock");
        this.setHardness(1.0F);
        this.setResistance(1.0F);
        this.setStepSound(soundClothFootstep);
    }

    /* Set the boundingbox of the block to 7/8 of a block */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + 1) - f), (double) (z + 1));
    }

    /* Slows entity down when on the block */
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        double slowdown = 0.7D; // 0.4D is soulsand
        par5Entity.motionX *= slowdown;
        par5Entity.motionZ *= slowdown;
    }

    /* Makes the block transparant */
    public boolean isOpaqueCube() {
        return false;
    }
    public int getRenderBlockPass() {
        return 1;
    }
}
