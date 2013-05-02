package com.TamModding.mgm.tab;

import com.TamModding.mgm.lib.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MythicalGodsTab extends CreativeTabs {

    public MythicalGodsTab(String label) {
        super(label);
    }

    public ItemStack getIconItemStack() {
        return new ItemStack(ItemHelper.holyGem);
    }
}
