package TAM.mods.mgm.lib;

import java.util.ArrayList;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHelper {

    private static final String[] blockNames = new String[] { "Holy Block", "Olympus Piller", "Unholy Block", "Unholy Ore" };
    private static final ArrayList<Block> blocks = new ArrayList<Block>();
    
    public static final Block unholyBlock = new UnholyBlock(ReferenceID.UNHOLYBLOCK);
    public static final Block unholyOre = new UnholyOre(ReferenceID.UNHOLYORE);
    public static final Block OlympusPiller = new OlympusPiller(ReferenceID.OLYMPUSPILLER);
    public static final Block holyBlock = new HolyBlock(ReferenceID.HOLYBLOCK);
    
    
    static {
       
        blocks.add(holyBlock);
        blocks.add(OlympusPiller);
        blocks.add(unholyBlock);
        blocks.add(unholyOre);
    }
    
    public static void init() {
        // Give all blocks a unlocalizedName
        for (int i = 0; i < blockNames.length; i++) {
            blocks.get(i).setUnlocalizedName(blockNames[i].replaceAll(" ", ""));
        }
        // Add all blocks to the GameRegister
        for (final Block block : blocks) {
            GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(".") + 1));
        }
        // Add all blocks to the LangRegister
        for (int i = 0; i < blockNames.length; i++) {
            LanguageRegistry.addName(blocks.get(i), blockNames[i]);
        }
    }
}
