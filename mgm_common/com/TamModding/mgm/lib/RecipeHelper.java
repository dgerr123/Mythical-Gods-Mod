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
        /* Adding Crafting recipes to the game */
        // 9 (Un)Holy gems -> 1 (Un)Holy block
        GameRegistry.addRecipe(new ItemStack(BlockHelper.unholyBlock), new Object[] {"GGG", "GGG", "GGG", 'G', ItemHelper.unholyGem});
        GameRegistry.addRecipe(new ItemStack(BlockHelper.holyBlock), new Object[] {"GGG", "GGG", "GGG", 'G', ItemHelper.holyGem});
        // 1 (Un)Holy block -> 9 (Un)Holy gems
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.unholyGem, 9), BlockHelper.unholyBlock);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemHelper.holyGem, 9), BlockHelper.holyBlock);
        
        // Recipe for Holy gem
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holyGem), new Object[] { "DGD", "GBG", "DGD", 'D', Item.diamond, 'G', ItemHelper.unholyGem, 'B', Block.blockDiamond });
        
        // Recipes for the (Un)Holy swords
        GameRegistry.addRecipe(new ItemStack(ItemHelper.unholySword), new Object[] { " G ", "NGN", " S ", 'S', Item.blazeRod, 'G', ItemHelper.unholyGem, 'N', Item.netherStar });
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holySword), new Object[] { " G ", " G ", " S ", 'S', ItemHelper.unholySword, 'G', ItemHelper.holyGem });
        
    }
}
