package TAM.mods.mgm.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import cpw.mods.fml.common.registry.GameRegistry;

public class initHelper {     public static void addRecipes()
{
    
    GameRegistry.addRecipe(new ItemStack(ItemHelper.holyGem), new Object[]{
           " G ",
           "GDG",
           " G ",
           'D', Item.diamond, 'G', ItemHelper.unholyGem
    });
    
    GameRegistry.addRecipe(new ItemStack(ItemHelper.unholySword), new Object[]{
        " G ",
        " G ",
        " S ",
        'S', Item.stick, 'G', ItemHelper.unholyGem
 });
    
    GameRegistry.addRecipe(new ItemStack(ItemHelper.holySword), new Object[]{
        " G ",
        " G ",
        " S ",
        'S', Item.stick, 'G', ItemHelper.holyGem
 });

}

public static void addHooks() {
  ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.unholyGem),1,3,15));
  ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.holyGem),1,3,10));
  ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.unholyGem),1,3,15));
  ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ItemHelper.holyGem),1,3,10));
}
}


