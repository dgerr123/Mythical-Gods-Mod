package com.TamModding.mgm.lib;

import java.util.ArrayList;

import com.TamModding.mgm.items.HolyGem;
import com.TamModding.mgm.items.UnholyGem;
import com.TamModding.mgm.tools.HolySword;
import com.TamModding.mgm.tools.UnholySword;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper {

 // Names of all the items, in the same order as registered lower in the class.
    private static final String[] itemNames = new String[] {"Holy Gem", "Holy Sword", "Unholy Gem", "Unholy Sword" };
   
 // Arraylist for containing all registered items
    private static final ArrayList<Item> items = new ArrayList<Item>();
    
    //EnumToolMaterial for different armors
    static EnumArmorMaterial holyARMOR = EnumHelper.addArmorMaterial("holyARMOR", 860, new int[] { 860, 860, 860, 860 }, 860);
    static EnumArmorMaterial unholyARMOR = EnumHelper.addArmorMaterial("unholyARMOR", 460, new int[] { 460, 460, 460, 460 }, 460);
    
 // EnumToolMaterial for different tools
    static EnumToolMaterial holyTOOL = EnumHelper.addToolMaterial("holyTOOL", 3, 3000, 12.0F, 888, 22);
    static EnumToolMaterial unholyTOOL = EnumHelper.addToolMaterial("unholyTOOL", 3, 2345, 12.0F, 550, 22);
    

    
    
    /*
     * Registering all the different items
     * Use ReferenceID.ITEMNAME for the ID
     */
    public static final Item holyGem = new HolyGem(ReferenceID.HOLYGEM);
    public static final Item holySword = new HolySword(ReferenceID.HOLYSWORD, holyTOOL);
    public static final Item unholyGem = new UnholyGem(ReferenceID.UNHOLYGEM);
    public static final Item unholySword = new UnholySword(ReferenceID.UNHOLYSWORD, unholyTOOL);
    
    
    /*
     * Adding all Items to the main ItemArray
     * Make sure all items are registered here and that the NamesArray contains the same
     * number of items, otherwise this would end in a crash.
     */
    static {
        items.add(holyGem);
        items.add(holySword);
        items.add(unholyGem);
        items.add(unholySword);
    }
    
    
    /**
     * Initialize all Items and their names
     */
    public static void init() {
        // Give all items a unlocalizedName
        for (int i = 0; i < itemNames.length; i++) {
            items.get(i).setUnlocalizedName(itemNames[i].replaceAll(" ", ""));
        }
        // Register all the item names in the LangRegister
        for (int i = 0; i < itemNames.length; i++) {
            LanguageRegistry.addName(items.get(i), itemNames[i]);
        }
        
    }
}