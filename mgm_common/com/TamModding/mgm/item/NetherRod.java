package com.TamModding.mgm.item;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class NetherRod extends ItemsBase {
    public NetherRod(int par1) {
        super(par1);
        super.registerTextures("NetherRod");
        this.setMaxStackSize(64);
    }
}