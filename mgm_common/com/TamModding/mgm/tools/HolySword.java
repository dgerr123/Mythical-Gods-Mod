package com.TamModding.mgm.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class HolySword extends SwordsBase {

    public HolySword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        super.registerTextures("HolySword");
    }

    @SideOnly(Side.CLIENT)
    @Override
    /* Make the item glow, like enchanted */
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
}
