package TAM.mods.mgm;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import TAM.mods.mgm.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.MOD_ID}, clientSideRequired = true, serverSideRequired = false)
public class MythicalGods {
    
    @Mod.Instance("MythicalGods")
    public static MythicalGods instance;
    
    
    static EnumArmorMaterial holyARMOR = EnumHelper.addArmorMaterial("holyARMOR", 860, new int[] { 860, 860, 860, 860 }, 860);
    static EnumArmorMaterial unholyARMOR = EnumHelper.addArmorMaterial("unholyARMOR", 460, new int[] { 460, 460, 460, 460 }, 460);
    
    static EnumToolMaterial holyTOOL = EnumHelper.addToolMaterial("holyTOOL", 3, 3000, 888.0F, 4, 22);
    static EnumToolMaterial unholyTOOL = EnumHelper.addToolMaterial("unholyTOOL", 3, 2345, 550.0F, 4, 22);

    
    
    
    
    
    
    
    
    
    
    
    
    
    
@PreInit
public void preInit(FMLPreInitializationEvent event){
    
    

    
    
    
   }

@Init
public void init(FMLInitializationEvent event){
    
  
    
   }

@PostInit
public void postInit(FMLPostInitializationEvent event){
    
    
    
    
    
   }
}
