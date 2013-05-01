package TAM.mods.mgm.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import TAM.mods.mgm.lib.ItemHelper;

public class MythicalGodsTab extends CreativeTabs {

    public MythicalGodsTab(String label) {
        super(label);
    }

    public ItemStack getIconItemStack() {
        return new ItemStack(ItemHelper.holyGem);
    }
}
