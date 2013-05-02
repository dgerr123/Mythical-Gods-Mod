package TAM.mods.mgm;

import net.minecraft.creativetab.CreativeTabs;
import TAM.mods.mgm.lib.BlockHelper;
import TAM.mods.mgm.lib.ItemHelper;
import TAM.mods.mgm.lib.LootHelper;
import TAM.mods.mgm.lib.RecipeHelper;
import TAM.mods.mgm.lib.Reference;
import TAM.mods.mgm.tab.MythicalGodsTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.MOD_ID}, clientSideRequired = true, serverSideRequired = false)
public class MythicalGods {
    
    @Mod.Instance(Reference.MOD_ID)
    public static MythicalGods instance;
    
    public static final CreativeTabs mythicalgodsTab = new MythicalGodsTab(Reference.MOD_ID);
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
@PreInit
public void preInit(FMLPreInitializationEvent event){
   
    BlockHelper.init();
    ItemHelper.init();
    RecipeHelper.init();
    LootHelper.init();

    LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_ID, "Mythical Gods Mod");
    
    
   }

@Init
public void init(FMLInitializationEvent event){
    
  
    
   }

@PostInit
public void postInit(FMLPostInitializationEvent event){
    
    
    
    
    
   }
}
