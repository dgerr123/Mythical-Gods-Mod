package TAM.mods.mgm.lib;

import java.util.ArrayList;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import TAM.mods.mgm.items.HolyGem;
import TAM.mods.mgm.items.UnholyGem;
import TAM.mods.mgm.tools.HolySword;
import TAM.mods.mgm.tools.UnholySword;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHelper {

    
    private static final String[] itemNames = new String[] { "Staff", "Trident", "Lightning Bolt", "Battle Axe", "Holy Gem", "Holy Sword", "Unholy Gem", "Unholy Sword" };
    private static final ArrayList<Item> items = new ArrayList<Item>();
    
    //Armor new Material
    static EnumArmorMaterial holyARMOR = EnumHelper.addArmorMaterial("holyARMOR", 860, new int[] { 860, 860, 860, 860 }, 860);
    static EnumArmorMaterial unholyARMOR = EnumHelper.addArmorMaterial("unholyARMOR", 460, new int[] { 460, 460, 460, 460 }, 460);
    
    //Tools new Material
    static EnumToolMaterial holyTOOL = EnumHelper.addToolMaterial("holyTOOL", 3, 3000, 12.0F, 888, 22);
    static EnumToolMaterial unholyTOOL = EnumHelper.addToolMaterial("unholyTOOL", 3, 2345, 12.0F, 550, 22);
    

    
    public static final Item holyGem = new HolyGem(ReferenceID.HOLYGEM);
    public static final Item holySword = new HolySword(ReferenceID.HOLYSWORD, holyTOOL);
    public static final Item unholyGem = new UnholyGem(ReferenceID.UNHOLYGEM);
    public static final Item unholySword = new UnholySword(ReferenceID.UNHOLYSWORD, unholyTOOL);
    
    
    
    static {
        items.add(holyGem);
        items.add(holySword);
        items.add(unholyGem);
        items.add(unholySword);
    }
    
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
