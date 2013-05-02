package TAM.mods.mgm.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {

    
    public static void init() {
        // Add crafting recipes
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holyGem), new Object[] { " G ", "GDG", " G ", 'D', Item.diamond, 'G', ItemHelper.unholyGem });
        GameRegistry.addRecipe(new ItemStack(ItemHelper.unholySword), new Object[] { " G ", " G ", " S ", 'S', Item.stick, 'G', ItemHelper.unholyGem });
        GameRegistry.addRecipe(new ItemStack(ItemHelper.holySword), new Object[] { " G ", " G ", " S ", 'S', Item.stick, 'G', ItemHelper.holyGem });
    }
}
