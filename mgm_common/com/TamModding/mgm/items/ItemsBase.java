package com.TamModding.mgm.items;

import com.TamModding.mgm.MythicalGods;
import com.TamModding.mgm.lib.TextureHelper;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemsBase extends Item {
    private String iconPath;

    public ItemsBase(int par1) {
        super(par1);
        this.setCreativeTab(MythicalGods.mythicalgodsTab);
    }

    public Item registerTextures(String texture) {
        iconPath = texture;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = TextureHelper.getIconFromTextureName(iconRegister, iconPath);
    }
}
