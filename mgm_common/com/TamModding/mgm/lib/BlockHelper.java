package com.TamModding.mgm.lib;

import java.util.ArrayList;

import net.minecraft.block.Block;

import com.TamModding.mgm.blocks.CloudBlock;
import com.TamModding.mgm.blocks.HolyBlock;
import com.TamModding.mgm.blocks.OlympusPillar;
import com.TamModding.mgm.blocks.UnholyBlock;
import com.TamModding.mgm.blocks.UnholyOre;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class BlockHelper {
    // Names of all the blocks, in the same order as registered lower in the class
    private static final String[] blockNames = new String[] { "Holy Block", "Olympus Pillar", "Unholy Block", "Unholy Ore", "Cloud Block" };

    // Arraylist for containing all registered blocks
    private static final ArrayList<Block> blocks = new ArrayList<Block>();

    /*
     * Registering all the different blocks Use ReferenceID.BLOCKNAME for the ID
     */
    public static final Block unholyBlock = new UnholyBlock(ReferenceID.UNHOLYBLOCK);
    public static final Block unholyOre = new UnholyOre(ReferenceID.UNHOLYORE);
    public static final Block olympusPillar = new OlympusPillar(ReferenceID.OLYMPUSPILLAR);
    public static final Block holyBlock = new HolyBlock(ReferenceID.HOLYBLOCK);
    public static final Block cloudBlock = new CloudBlock(ReferenceID.CLOUDBLOCK);

    /*
     * Adding all Blocks to the main BlockArray Make sure all blocks are registered here and that the NamesArray contains the same number of items,
     * otherwise this would end in a crash.
     */
    static {
        blocks.add(holyBlock);
        blocks.add(olympusPillar);
        blocks.add(unholyBlock);
        blocks.add(unholyOre);
        blocks.add(cloudBlock);
    }

    /**
     * Initialize all the Blocks and their names.
     */
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
