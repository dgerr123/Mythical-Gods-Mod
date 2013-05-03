package com.TamModding.mgm.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {

    /**
     * Initializes all the Recipes
     */
    public static void init() {
        // Add crafting recipes
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holyGem), new Object[] { "DGD", "GBG", "DGD", 'D', Item.diamond, 'G', ItemHelper.unholyGem, 'B', Block.blockDiamond });
        GameRegistry.addRecipe(new ItemStack(ItemHelper.unholySword), new Object[] { " G ", "NGN", " S ", 'S', Item.blazeRod, 'G', ItemHelper.unholyGem, 'N', Item.netherStar });
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holySword), new Object[] { " G ", " G ", " S ", 'S', ItemHelper.unholySword, 'G', ItemHelper.holyGem });
    }
}