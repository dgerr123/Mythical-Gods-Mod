package com.TamModding.mgm.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.TamModding.mgm.lib.ItemHelper;

public class MythicalGodsTab extends CreativeTabs {

    public MythicalGodsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemHelper.holyGem);
    }
}