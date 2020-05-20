package net.minecraft.src.maccie;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.mod_maccie;

public class Recipes {

	public static void addRecipes()
	{
		ModLoader.addRecipe(new ItemStack(mod_maccie.rawloempia, 2), new Object[] { 
   			"WWW", "CTC", "WWW", Character.valueOf('C'), Item.chickenRaw, Character.valueOf('W'), Item.wheat, Character.valueOf('T'), Item.seeds});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.loempiasword, 1), new Object[] {
   		       "x", "x", "o", Character.valueOf('x'), mod_maccie.loempia, Character.valueOf('o'), Item.stick});	
   			//Ranik.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikBlock, 1), new Object[] {
	   		       "xxx", "xxx", "xxx", Character.valueOf('x'), mod_maccie.RanikBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikBar, 9), new Object[] {
	   		       "x", Character.valueOf('x'), mod_maccie.RanikBlock});
   			
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikPick, 1), new Object[] {
	   		       "xxx", " | ", " | ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikAxe, 1), new Object[] {
	   		       "xx ", "x| ", " | ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikAxe, 1), new Object[] {
	   		       " xx", " |x", " | ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikSword, 1), new Object[] {
	   		       "x", "x", "|", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikHoe, 1), new Object[] {
	   		       "xx ", " | ", " | ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikHoe, 1), new Object[] {
	   		       " xx", " |", " |", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikHoe, 1), new Object[] {
	   		       "xx ", "| ", "| ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikSpade, 1), new Object[] {
	   		       " x ", " | ", " | ", Character.valueOf('x'), mod_maccie.RanikBar, Character.valueOf('|'), Item.stick});
   			//Armor.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikHelmet, 1), new Object[] {
	   		       "xxx", "x x", Character.valueOf('x'), mod_maccie.RanikBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikBody, 1), new Object[] {
	   		       "x x", "xxx", "xxx", Character.valueOf('x'), mod_maccie.RanikBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikLegs, 1), new Object[] {
	   		       "xxx", "x x", "x x", Character.valueOf('x'), mod_maccie.RanikBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.RanikBoots, 1), new Object[] {
	   		       "x x", "x x", Character.valueOf('x'), mod_maccie.RanikBar});
   			
   		//wOOt.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtBlock, 1), new Object[] {
	   		       "xxx", "xxx", "xxx", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0)});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOty, 9), new Object[] {
	   		       "x", Character.valueOf('x'), mod_maccie.wOOtBlock});
   			
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtPick, 1), new Object[] {
	   		       "xxx", " | ", " | ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtAxe, 1), new Object[] {
	   		       "xx ", "x| ", " | ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtAxe, 1), new Object[] {
	   		       " xx", " |x", " | ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtSword, 1), new Object[] {
	   		       "x", "x", "|", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtHoe, 1), new Object[] {
	   		       "xx ", " | ", " | ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtHoe, 1), new Object[] {
	   		       " xx", " |", " |", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtHoe, 1), new Object[] {
	   		       "xx ", "| ", "| ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtSpade, 1), new Object[] {
	   		       " x ", " | ", " | ", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0), Character.valueOf('|'), Item.stick});
   			//Armor.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtHelmet, 1), new Object[] {
	   		       "xxx", "x x", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0)});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtBody, 1), new Object[] {
	   		       "x x", "xxx", "xxx", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0)});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtLegs, 1), new Object[] {
	   		       "xxx", "x x", "x x", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0)});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.wOOtBoots, 1), new Object[] {
	   		       "x x", "x x", Character.valueOf('x'), new ItemStack(mod_maccie.wOOty, 1, 0)});
   			
   			
   			
   			//Eldum.
   		//Ranik.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumBlock, 1), new Object[] {
	   		       "xxx", "xxx", "xxx", Character.valueOf('x'), mod_maccie.EldumBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumBar, 9), new Object[] {
	   		       "x", Character.valueOf('x'), mod_maccie.EldumBlock});
   			
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumPick, 1), new Object[] {
	   		       "xxx", " | ", " | ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumAxe, 1), new Object[] {
	   		       "xx ", "x| ", " | ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumAxe, 1), new Object[] {
	   		       " xx", " |x", " | ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});	
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumSword, 1), new Object[] {
	   		       "x", "x", "|", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumHoe, 1), new Object[] {
	   		       "xx ", " | ", " | ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumHoe, 1), new Object[] {
	   		       " xx", " |", " |", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumHoe, 1), new Object[] {
	   		       "xx ", "| ", "| ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumSpade, 1), new Object[] {
	   		       " x ", " | ", " | ", Character.valueOf('x'), mod_maccie.EldumBar, Character.valueOf('|'), Item.stick});
   			//Armor.
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumHelmet, 1), new Object[] {
	   		       "xxx", "x x", Character.valueOf('x'), mod_maccie.EldumBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumBody, 1), new Object[] {
	   		       "x x", "xxx", "xxx", Character.valueOf('x'), mod_maccie.EldumBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumLegs, 1), new Object[] {
	   		       "xxx", "x x", "x x", Character.valueOf('x'), mod_maccie.EldumBar});
   			ModLoader.addRecipe(new ItemStack(mod_maccie.EldumBoots, 1), new Object[] {
	   		       "x x", "x x", Character.valueOf('x'), mod_maccie.EldumBar});
		
		
    	     ModLoader.addRecipe(new ItemStack(mod_maccie.CPlanks, 4), new Object [] {
   				"x", Character.valueOf('x'), mod_maccie.CWood	} ); 
   			ModLoader.addRecipe(new ItemStack(Item.stick, 4), new Object [] {
   				"x", "x", Character.valueOf('x'), mod_maccie.CPlanks	} );
   			ModLoader.addRecipe(new ItemStack(Block.workbench, 1), new Object [] {
	   			 "xx", "xx", Character.valueOf('x'), mod_maccie.CPlanks	} );
   			
   	        ModLoader.addRecipe(new ItemStack(Block.chest), new Object[] {"###", "# #", "###", '#', mod_maccie.CPlanks});
   	        ModLoader.addRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"#W#", "#W#", '#', Item.stick, 'W', mod_maccie.CPlanks});
   	        ModLoader.addRecipe(new ItemStack(Block.jukebox, 1), new Object[] {"###", "#X#", "###", '#', mod_maccie.CPlanks, 'X', Item.diamond});
   	        ModLoader.addRecipe(new ItemStack(Block.music, 1), new Object[] {"###", "#X#", "###", '#', mod_maccie.CPlanks, 'X', Item.redstone});
   	        ModLoader.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[] {"###", "XXX", "###", '#', mod_maccie.CPlanks, 'X', Item.book});
   	     ModLoader.addRecipe(new ItemStack(Block.fence, 2), new Object[] {"###", "###", '#', Item.stick});
         ModLoader.addRecipe(new ItemStack(Block.stairSingle, 6, 2), new Object[] {"###", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"##", "##", "##", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[] {"###", "###", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Item.sign, 1), new Object[] {"###", "###", " X ", '#', mod_maccie.CPlanks, 'X', Item.stick});
         ModLoader.addRecipe(new ItemStack(Item.bowlEmpty, 4), new Object[] {"# #", " # ", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Item.boat, 1), new Object[] {"# #", "###", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Block.stairCompactPlanks, 4), new Object[] {"#  ", "## ", "###", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Block.pressurePlatePlanks, 1), new Object[] {"##", '#', mod_maccie.CPlanks});
         ModLoader.addRecipe(new ItemStack(Item.bed, 1), new Object[] {"###", "XXX", '#', Block.cloth, 'X', mod_maccie.CPlanks});
         
         
         ModLoader.addRecipe(new ItemStack(mod_maccie.Sdonut, 1), new Object [] {
				"xvx", "v v", "xvx", Character.valueOf('v'), Item.wheat, Character.valueOf('x'), Item.sugar	} ); 
			ModLoader.addRecipe(new ItemStack(mod_maccie.donut, 1), new Object [] {
				" v ", "v v", " v ", Character.valueOf('v'), Item.wheat, Character.valueOf('x'), Item.sugar	} ); 
			ModLoader.addRecipe(new ItemStack(mod_maccie.Cdonut, 1), new Object [] {
				"xvx", "v v", "xvx", Character.valueOf('x'), new ItemStack(Item.dyePowder, 1, 3), Character.valueOf('v'), Item.wheat	} ); 

		
	}
	
	public static void addSmelting()
	{
		ModLoader.addSmelting(mod_maccie.rawloempia.shiftedIndex, new ItemStack(mod_maccie.loempia, 1));
	   			ModLoader.addSmelting(mod_maccie.RanikOre.blockID, new ItemStack(mod_maccie.RanikBar, 1));
	   			ModLoader.addSmelting(mod_maccie.EldumOre.blockID, new ItemStack(mod_maccie.EldumBar, 1));
	   			
	   			
	}
	
	
}
