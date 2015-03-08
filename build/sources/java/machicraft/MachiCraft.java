package machicraft;

import generation.MachiCraftWorldGeneration;
import machicraft.help.Reference;
import machicraft.help.RegisterHelper;
import machicraft.init.ModArmory;
import machicraft.init.ModBlocks;
import machicraft.init.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import crafting.ModRecipes;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MachiCraft {
	MachiCraftWorldGeneration eventWorldGen = new MachiCraftWorldGeneration();
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
		ModArmory.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
    }
    
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
    	ModRecipes.init();
    }	
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }

}
