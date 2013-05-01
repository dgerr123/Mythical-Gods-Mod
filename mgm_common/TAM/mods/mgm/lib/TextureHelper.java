package TAM.mods.mgm.lib;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class TextureHelper {
    
    public static Icon getIconFromTextureName(IconRegister iconRegister, String name) {
    return iconRegister.registerIcon(Reference.MOD_ID + ":" + name);
}

}
