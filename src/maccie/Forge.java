package net.minecraft.src.maccie;

import net.minecraft.src.mod_maccie;
import net.minecraft.src.forge.MinecraftForge;
import net.minecraft.src.forge.MinecraftForgeClient;

public class Forge {
	
	public static void addForgeTextures()
	{
		
		MinecraftForgeClient.preloadTexture("/maccie/mod/blocks/ores.png");	
		MinecraftForgeClient.preloadTexture("/maccie/mod/items/tools.png");
		MinecraftForgeClient.preloadTexture("/maccie/mod/items/food.png");
		MinecraftForgeClient.preloadTexture("/maccie/mod/blocks/plants.png");
		MinecraftForgeClient.preloadTexture("/maccie/mod/blocks/other.png");
		
		//Armor.
		
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/ranik_1.png");
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/ranik_2.png");
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/wOOt_1.png");
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/wOOt_2.png");
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/Eldum_1.png");
        MinecraftForgeClient.preloadTexture("/maccie/mod/armor/Eldum_2.png");
		
		
	}
	
	public static void addForgeTools()
	{
	
		MinecraftForge.setToolClass(mod_maccie.RanikPick, "pickaxe", 4);
        MinecraftForge.setToolClass(mod_maccie.RanikSpade, "shovel", 4);
        MinecraftForge.setToolClass(mod_maccie.RanikAxe, "axe", 4);
        MinecraftForge.setToolClass(mod_maccie.wOOtPick, "pickaxe", 2);
        MinecraftForge.setToolClass(mod_maccie.wOOtSpade, "shovel", 2);
        MinecraftForge.setToolClass(mod_maccie.wOOtAxe, "axe", 2);
        MinecraftForge.setToolClass(mod_maccie.EldumPick, "pickaxe", 5);
        MinecraftForge.setToolClass(mod_maccie.EldumSpade, "shovel", 6);
        MinecraftForge.setToolClass(mod_maccie.EldumAxe, "axe", 5);
		
	}
	
	
	public static void addForgeBlocks()
	{
        MinecraftForge.setBlockHarvestLevel(mod_maccie.RanikOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(mod_maccie.RanikBlock, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(mod_maccie.wOOtOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(mod_maccie.wOOtBlock, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(mod_maccie.EldumOre, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(mod_maccie.EldumBlock, "pickaxe", 2);
	}
	
	public static void addBonemeal()
	{
    	MinecraftForge.registerBonemealHandler(new Bonemeal());
	}

}
