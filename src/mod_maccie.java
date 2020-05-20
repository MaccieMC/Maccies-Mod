//Maccie's mod by karatemaccie, do NOT copy!
package net.minecraft.src;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.*;
import net.minecraft.src.maccie.*;
import net.minecraft.src.vazkii.updatemanager.*;

import java.io.*;
import java.util.*;

public class mod_maccie extends BaseMod implements IUpdateManager, IUMAdvanced
{	
	
	

	
    public static final StepSound soundPowderFootstep = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound soundWoodFootstep = new StepSound("wood", 1.0F, 1.0F);
    public static final StepSound soundGravelFootstep = new StepSound("gravel", 1.0F, 1.0F);
    public static final StepSound soundGrassFootstep = new StepSound("grass", 1.0F, 1.0F);
    public static final StepSound soundStoneFootstep = new StepSound("stone", 1.0F, 1.0F);
    public static final StepSound soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
    public static final StepSound soundGlassFootstep = new StepSoundStone("stone", 1.0F, 1.0F);
    public static final StepSound soundClothFootstep = new StepSound("cloth", 1.0F, 1.0F);
    public static final StepSound soundSandFootstep = new StepSoundSand("sand", 1.0F, 1.0F);
	
    //private WorldGenRanikTree WorldGenRanikTree;
    protected Minecraft mc;
	
    //static Configuration configuration = new Configuration(new File(Minecraft.getMinecraftDir(), "config/maccie/mod/idconfig.cfg"));
    //Blocks
   // public static int RanikOreID = mod_maccie.Baseprops.getInt("Ranik_Ore");
    /*public static int RanikID = mod_maccie.Baseprops.getInt("Ranik_Block");
    public static int wOOtOreID = mod_maccie.Baseprops.getInt("wOOt_Ore");
    public static int wOOtID = mod_maccie.Baseprops.getInt("wOOt_Block");
    public static int EldumOreID = mod_maccie.Baseprops.getInt("Eldum_Ore");
    public static int EldumID = mod_maccie.Baseprops.getInt("Eldum_Block");
    //Armor
    public static int RanikBarID = mod_maccie.Baseprops.getInt("Ranik_Ingot");
    public static int wOOtyID = mod_maccie.Baseprops.getInt("wOOty");
    public static int EldumBarID = mod_maccie.Baseprops.getInt("Eldum_Ingot");
    
    public static int RanikHelmID = mod_maccie.Baseprops.getInt("Ranik_Helmet");
    public static int RanikBodyID = mod_maccie.Baseprops.getInt("Ranik_Chestplate");
    public static int RanikLegsID = mod_maccie.Baseprops.getInt("Ranik_Legs");
    public static int RanikBootsID = mod_maccie.Baseprops.getInt("Ranik_Boots");
    
    public static int wOOtHelmID = mod_maccie.Baseprops.getInt("wOOt_Helmet");
    public static int wOOtBodyID = mod_maccie.Baseprops.getInt("wOOt_Chestplate");
    public static int wOOtLegsID = mod_maccie.Baseprops.getInt("wOOt_Legs");
    public static int wOOtBootsID = mod_maccie.Baseprops.getInt("wOOt_Boots");
    
    public static int EldumHelmID = mod_maccie.Baseprops.getInt("Eldum_Helmet");
    public static int EldumBodyID = mod_maccie.Baseprops.getInt("Eldum_Chestplate");
    public static int EldumLegsID = mod_maccie.Baseprops.getInt("Eldum_Legs");
    public static int EldumBootsID = mod_maccie.Baseprops.getInt("Eldum_Boots");
    //Tools 
    public static int RanikPickID = mod_maccie.Baseprops.getInt("Ranik_Pick");
    public static int RanikAxeID = mod_maccie.Baseprops.getInt("Ranik_Axe");
    public static int RanikSpadeID = mod_maccie.Baseprops.getInt("Ranik_Spade");
    public static int RanikSwordID = mod_maccie.Baseprops.getInt("Ranik_Sword");
    public static int RanikHoeID = mod_maccie.Baseprops.getInt("Ranik_Hoe");
    
    public static int wOOtPickID = mod_maccie.Baseprops.getInt("wOOt_Pickaxe");
    public static int wOOtAxeID = mod_maccie.Baseprops.getInt("wOOt_Axe");
    public static int wOOtSpadeID = mod_maccie.Baseprops.getInt("wOOt_Shovel");
    public static int wOOtSwordID = mod_maccie.Baseprops.getInt("wOOt_Sword");
    public static int wOOtHoeID = mod_maccie.Baseprops.getInt("wOOt_Hoe");
    
    public static int EldumPickID = mod_maccie.Baseprops.getInt("Eldum_Pickaxe");
    public static int EldumAxeID = mod_maccie.Baseprops.getInt("Eldum_Axe");
    public static int EldumSpadeID = mod_maccie.Baseprops.getInt("Eldum_Shovel");
    public static int EldumSwordID = mod_maccie.Baseprops.getInt("Eldum_Sword");
    public static int EldumHoeID = mod_maccie.Baseprops.getInt("Eldum_Hoe");
    
    public static int RawLoempiaID = mod_maccie.Baseprops.getInt("Raw_Loempia");
    public static int LoempiaID = mod_maccie.Baseprops.getInt("Loempia");
    public static int LoempiaswordID = mod_maccie.Baseprops.getInt("Loempia_Sword");
    
   // public static int nSnorID = mod_maccie.Baseprops.getInt("Loempia_Sword");
   // public static int itSnorID = mod_maccie.Baseprops.getInt("Loempia_Sword");
    
    public static int CLeavesID = mod_maccie.Baseprops.getInt("Cocoa_Leaves");
    public static int CWoodID = mod_maccie.Baseprops.getInt("Cocoa_Logs");
    public static int CocoaID = mod_maccie.Baseprops.getInt("Cocoa_Fruit");
    public static int CSaplingID = mod_maccie.Baseprops.getInt("Cocoa_Sapling");
    public static int CPlanksID = mod_maccie.Baseprops.getInt("Cocoa_Planks");
    
    public static int sDonutID = mod_maccie.Baseprops.getInt("Sugar_Donut");
    public static int cDonutID = mod_maccie.Baseprops.getInt("Choco_Donut");
    public static int donutID = mod_maccie.Baseprops.getInt("Donut");*/
    
    
   /* public static int configurationProperties()
    {
            configuration.load();
            RanikOreID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Ranik Ore", 212).value);
            RanikID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Ranik Block", 229).value);
            wOOtOreID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("wOOt Ore", 213).value);
            wOOtID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("wOOt Block", 228).value);
            EldumOreID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Eldum Ore", 233).value);
            EldumID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Eldum Block", 234).value);
            
            RanikBarID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Ingot", Configuration.CATEGORY_ITEM, 211).value);
            wOOtyID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOty", Configuration.CATEGORY_ITEM, 227).value);
            EldumBarID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Ingot", Configuration.CATEGORY_ITEM, 1085).value);
            //Armor
            RanikHelmID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Helmet", Configuration.CATEGORY_ITEM, 214).value);
            RanikBodyID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Chestplate", Configuration.CATEGORY_ITEM, 215).value);
            RanikLegsID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Legplates", Configuration.CATEGORY_ITEM, 216).value);
            RanikBootsID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Boots", Configuration.CATEGORY_ITEM, 217).value);
            
            wOOtHelmID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Helmet", Configuration.CATEGORY_ITEM, 223).value);
            wOOtBodyID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Chestplate", Configuration.CATEGORY_ITEM, 224).value);
            wOOtLegsID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Legplates", Configuration.CATEGORY_ITEM, 225).value);
            wOOtBootsID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Boots", Configuration.CATEGORY_ITEM, 226).value);
            
            EldumHelmID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Helmet", Configuration.CATEGORY_ITEM, 1088).value);
            EldumBodyID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Chestplate", Configuration.CATEGORY_ITEM, 1089).value);
            EldumLegsID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Legplates", Configuration.CATEGORY_ITEM, 1090).value);
            EldumBootsID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Boots", Configuration.CATEGORY_ITEM, 1091).value);
            //Tools
            RanikPickID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Pickaxe", Configuration.CATEGORY_ITEM, 206).value);
            RanikAxeID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Axe", Configuration.CATEGORY_ITEM, 208).value);
            RanikSpadeID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Shovel", Configuration.CATEGORY_ITEM, 207).value);
            RanikHoeID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Hoe", Configuration.CATEGORY_ITEM, 209).value);
            RanikSwordID = Integer.parseInt(configuration.getOrCreateIntProperty("Ranik Sword", Configuration.CATEGORY_ITEM, 210).value);
            
            wOOtPickID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Pickaxe", Configuration.CATEGORY_ITEM, 218).value);
            wOOtAxeID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Axe", Configuration.CATEGORY_ITEM, 220).value);
            wOOtSpadeID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Shovel", Configuration.CATEGORY_ITEM, 219).value);
            wOOtHoeID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Hoe", Configuration.CATEGORY_ITEM, 221).value);
            wOOtSwordID = Integer.parseInt(configuration.getOrCreateIntProperty("wOOt Sword", Configuration.CATEGORY_ITEM, 222).value);
            
            EldumPickID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Pickaxe", Configuration.CATEGORY_ITEM, 1080).value);
            EldumAxeID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Axe", Configuration.CATEGORY_ITEM, 1082).value);
            EldumSpadeID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Shovel", Configuration.CATEGORY_ITEM, 1081).value);
            EldumHoeID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Hoe", Configuration.CATEGORY_ITEM, 1083).value);
            EldumSwordID = Integer.parseInt(configuration.getOrCreateIntProperty("Eldum Sword", Configuration.CATEGORY_ITEM, 1084).value);
            
            RawLoempiaID = Integer.parseInt(configuration.getOrCreateIntProperty("Uncooked Loempia", Configuration.CATEGORY_ITEM, 1094).value);
            LoempiaID = Integer.parseInt(configuration.getOrCreateIntProperty("Loempia", Configuration.CATEGORY_ITEM, 1092).value);
            LoempiaswordID = Integer.parseInt(configuration.getOrCreateIntProperty("Loempia Sword", Configuration.CATEGORY_ITEM, 1093).value);
            
           // nSnorID = Integer.parseInt(configuration.getOrCreateIntProperty("Normal moustache", Configuration.CATEGORY_ITEM, 1095).value);
          //  nSnorID = Integer.parseInt(configuration.getOrCreateIntProperty("Italian moustache", Configuration.CATEGORY_ITEM, 1096).value);
            
            CWoodID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Cocoa-tree logs", 235).value);
            CLeavesID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Cocoa-tree Leaves", 236).value);
            CSaplingID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Cocoa-tree-Sapling", 237).value);
            CocoaID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Cocoa-tree fruit", 238).value);
            
            cDonutID = Integer.parseInt(configuration.getOrCreateIntProperty("Chocolade Donut", Configuration.CATEGORY_ITEM, 1202).value);
            sDonutID = Integer.parseInt(configuration.getOrCreateIntProperty("Sugar donut", Configuration.CATEGORY_ITEM, 1201).value);
            donutID = Integer.parseInt(configuration.getOrCreateIntProperty("Normal Donut", Configuration.CATEGORY_ITEM, 1200).value);
            
            
            configuration.save();
            return RanikOreID;
    }*/
	       
    
    
    static EnumToolMaterial toolRANIK = EnumHelper.addToolMaterial("RANIK", 4, 1250, 8F, 4, 40);
    static EnumToolMaterial toolwOOt = EnumHelper.addToolMaterial("wOOt", 3, 200, 7F, 2, 16);
    static EnumToolMaterial toolELDUM = EnumHelper.addToolMaterial("Eldum", 5, 1520, 9F, 5, 10);
    static EnumArmorMaterial armorRANIK = EnumHelper.addArmorMaterial("Ranik", 33, new int[] {3, 8, 6, 3}, 40);
    static EnumArmorMaterial armorwOOt = EnumHelper.addArmorMaterial("wOOt", 15, new int[] {2, 6, 5, 2}, 14);
    static EnumArmorMaterial armorELDUM = EnumHelper.addArmorMaterial("Eldum", 35, new int[] {4, 11, 8, 4}, 12);
    
    static EnumArmorMaterial armorSNOR1 = EnumHelper.addArmorMaterial("Snor1", 1, new int[] {1, 1, 1, 1}, 1);
    
    
    
    
    
    public static Item lodestonetpitem;
	//public static Block JungleLogFix = new Block(233, 0).setHardness(3F).setBlockName("junglelogfix");
	public static Item loempia;
	public static Item rawloempia;
	public static Item loempiasword;
	
	
	//Ranik.
	   public static Item RanikPick;
	   public static Item RanikSpade;
	   public static Item RanikAxe;
	   public static Item RanikHoe;
	   public static Item RanikSword;
	   public static Item RanikBar;
	   public static Block RanikOre;
	   public static Block RanikBlock;
	   
	   //public static Block RanikSapling =  RanikSapling(232, 0).setHardness(3F).setBlockName("RanikBlock");
		/*public static Block mandPortal =  BlockMandPortal(220, 49).setHardness(-1F).setStepSound(Block.soundGlassFootstep).setLightValue(0.75F).setBlockName("MandPortal");
		 */
	   //Armor.
	   
	   public static Item RanikHelmet;
	   public static Item RanikBody;
	   public static Item RanikLegs;
	   public static Item RanikBoots;
	   //*/
	   
	   
	//wOOt
	   public static Block wOOtOre;
	   public static Block wOOtBlock;
	   public static Item wOOty;
	   
	   //Tools.
	   public static Item wOOtPick;
	   public static Item wOOtSpade;
	   public static Item wOOtAxe;
	   public static Item wOOtHoe;
	   public static Item wOOtSword;
	   //Armor.
	   public static Item wOOtHelmet;
	   public static Item wOOtBody;
	   public static Item wOOtLegs;
	   public static Item wOOtBoots;
	   //*/ 
	 //Temp. placeholder. 
	   //Eldum.
	   public static Item EldumPick;
	   public static Item EldumSpade;
	   public static Item EldumAxe;
	   public static Item EldumHoe;
	   public static Item EldumSword;
	   public static Item EldumBar;
	   public static Block EldumOre;
	   public static Block EldumBlock;
	   public static Item EldumHelmet;
	   public static Item EldumBody;
	   public static Item EldumLegs;
	   public static Item EldumBoots;
	  // public static Item nSnor =  Armor(nSnorID, armorSNOR1, ModLoader.addArmor("moustache"), 0), 0)nSnor");
	   //public static Item itSnor =  Armor(itSnorID, armorSNOR1, ModLoader.addArmor("moustache"), 0), 0)itSnor");
	   
	   //public static Block jungleportal =  BlockJunglePortal(220).setHardness(-1F).setStepSound(Block.soundGlassFootstep).setLightValue(0.75F).setBlockName("DesertPortal");

	   
	   //Food update.
	   public static Block CWood;
	   public static Block CLeaves;
	   public static Block CSapling;
	   public static Block CPlanks;
	   public static Block Wpane;
	   public static Item donut;
	   public static Item Sdonut;
	  public static Item  Cdonut;
	  public static Item thunder;
	  
	   public static Block tomatoplant;
		  public static Item tomato;
		  public static Item tomatoSeed;
		  
		  public static Item mbtop;
		  public static Item mbbottom;
		  public static Item MobsBane;


	   public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
       {
		   
		   
		   
           for(int i = 0; i < 5; i++)
           {
               int randPosX = chunkX + rand.nextInt(16);
               int randPosY = rand.nextInt(32);
               int randPosZ = chunkZ + rand.nextInt(16);
               (new WorldGenMinable(mod_maccie.RanikOre.blockID, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
           }
           
         //  BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ); 
    	   //WorldGenRanikTree tree = WorldGenRanikTree; 
    	   //if(biome instanceof BiomeGenForest)
    	   		
    	   //{ 
    	   	/*for(int x = 0; x < 1; x++)
    	   	{
    	   		int Xcoord = chunkX + rand.nextInt(16); 
    	   		int Zcoord = chunkZ + rand.nextInt(16); 
    	   		int i = world.getHeightValue(Xcoord, Zcoord); 
    	   		tree.generate(world, rand, Xcoord, i, Zcoord); 
    	   	}*/
    	   
           
           
           
           for(int i = 0; i < 20; i++)
           {
               int randPosX = chunkX + rand.nextInt(16);
               int randPosY = rand.nextInt(64);
               int randPosZ = chunkZ + rand.nextInt(16);
               (new WorldGenMinable(mod_maccie.wOOtOre.blockID, 12)).generate(world, rand, randPosX, randPosY, randPosZ);
           
           }
           BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
           
           if((biomegenbase instanceof BiomeGenEnd))
           {
               int randPosX = chunkX + rand.nextInt(16);
               int randPosY = rand.nextInt(250);
               int randPosZ = chunkZ + rand.nextInt(16);
               (new WorldGenEndMinable(mod_maccie.wOOtOre.blockID, 20)).generate(world, rand, randPosX, randPosY, randPosZ);
           
           }
               
            WorldGenCocoaTrees worldgennameheretrees = new WorldGenCocoaTrees();
           if((biomegenbase instanceof BiomeGenJungle) || (biomegenbase instanceof BiomeGenJungle))
           {
               int k = chunkX + rand.nextInt(16) + 8;
               int l = chunkZ + rand.nextInt(16) + 8;
               int i1 = world.getHeightValue(k, l);
               worldgennameheretrees.setScale(1.0D, 1.0D, 1.0D);
               worldgennameheretrees.generate(world, rand, k, i1, l);
           }
               
               
               
           
           
           
         
           
           
           }
	   
	   public void generateNether(World world, Random rand, int chunkX, int chunkZ)
       {
           
		   
		   for(int bob = 0; bob < 4; bob++)
           {
               int randPosX = chunkX + rand.nextInt(16);
               int randPosY = rand.nextInt(250);
               int randPosZ = chunkZ + rand.nextInt(16);
               new WorldGenNOres(mod_maccie.EldumOre.blockID, 20).generate(world, rand, randPosX, randPosY, randPosZ);
           }
           
       }
          
	   
         
	   
	   public String getVersion()
   {
       return "1.03a, By karatemaccie";
   }
	   public String getUpdateURL() {
		   return "http://dl.dropbox.com/u/65141712/maccieversion.txt";
		 }
	
	   public String getModURL() {
		   return "http://www.minecraftforum.net/topic/1069876-/";
		 }
	   
	   public ModType getModType() {
		   return ModType.UNDEFINED;
		   }

	   public String getModName() {
		return "Maccie's Mod";
	}	   
	   
	   public String getChangelogURL() {
		return "http://dl.dropbox.com/u/65141712/macciechangelog.txt";
	}
	
   
  // public mod_maccie()
   {
	   
	   
	  // DimensionAPI.registerDimension(new WorldProviderJungle());
	   
	   
   }

   
  
   public void addRenderer(Map map) 
   { 
       map.put(net.minecraft.src.maccie.EntityThunderbolt.class, new RenderThunderbolt(0));
   } 
   
   
   
   public void load()
   {   
	   
	      if (Graphics == 1)
	      {
	    	  CacaoTexture = 3;
	      }
	      else
	      {
	    	  CacaoTexture = 2;
	      }
	   
	   loempia = (new Food(LoempiaID, 20, 20F,true)).setAlwaysEdible().setIconCoord(1, 0).setItemName("Loempia");
	  	 rawloempia = (new Food(RawLoempiaID, 2, 1.2F,true)).setAlwaysEdible().setPotionEffect(Potion.hunger.id, 100, 0, 0.8F).setIconCoord(0, 0).setItemName("RawLoempia");
	  	 loempiasword = new Loempiasword(LoempiaSwordID, EnumToolMaterial.IRON).setIconCoord(2, 0).setItemName("Loempiasword");
	  	
	  	
	  	//Ranik.
	  	    RanikPick = (new Pickaxe(RanikPickID, toolRANIK)).setIconCoord(0, 6).setItemName("RanikPick");
	  	    RanikSpade = new Spade(RanikSpadeID, toolRANIK).setIconCoord(0, 5).setItemName("RanikSpade");
	  	    RanikAxe = new Axe(RanikAxeID, toolRANIK).setIconCoord(0, 7).setItemName("RanikAxe");
	  	    RanikHoe = new Hoe(RanikHoeID, toolRANIK).setIconCoord(0, 8).setItemName("RanikHoe");
	  	    RanikSword = new Sword(RanikSwordID, toolRANIK).setIconCoord(0, 4).setItemName("RanikSword");
	  	    RanikBar = (new Ingot(RanikBarID, false)).setIconCoord(0, 9).setItemName("RanikBar");
	  	    RanikOre = new BlockMineral(RanikOreID, 0).setHardness(3F).setBlockName("BlockRanikOre");
	  	    RanikBlock = new BlockMineral(RanikBlockID, 1).setHardness(3F).setBlockName("RanikBlock");
	  	   
	  	   // RanikSapling = new RanikSapling(232, 0).setHardness(3F).setBlockName("RanikBlock");
	  		/* mandPortal = new BlockMandPortal(220, 49).setHardness(-1F).setStepSound(Block.soundGlassFootstep).setLightValue(0.75F).setBlockName("MandPortal");
	  		 */
	  	   //Armor.
	  	   
	  	    RanikHelmet = new Armor(RanikHelmID, armorRANIK, ModLoader.addArmor("ranik"), 0).setIconCoord(0, 0).setItemName("RanikHelmet");
	  	    RanikBody = new Armor(RanikPlateID, armorRANIK, ModLoader.addArmor("ranik"), 1).setIconCoord(0, 1).setItemName("RanikChestplate");
	  	    RanikLegs = new Armor(RanikLegsID, armorRANIK, ModLoader.addArmor("ranik"), 2).setIconCoord(0, 2).setItemName("RanikLeggings");
	  	    RanikBoots = new Armor(RanikBootsID, armorRANIK, ModLoader.addArmor("ranik"), 3).setIconCoord(0, 3).setItemName("RanikBoots");
	  	   //*/
	  	   
	  	   
	  	//wOOt
	  	    wOOtOre = new wOOtOre(wOOtOreID, 2, Material.iron).setHardness(2F).setBlockName("wOOtore");
	  	    wOOtBlock= new BlockMineral(wOOtBlockID, 3).setHardness(2F).setBlockName("wOOtBlock");
	  	    wOOty = (new Ingot(wOOtyID, true)).setIconCoord(1, 9).setItemName("wOOty");
	  	   
	  	   //Tools.
	  	    wOOtPick = (new Pickaxe(wOOtPickID, toolwOOt)).setIconCoord(1, 6).setItemName("wOOtPick");
	  	    wOOtSpade = new Spade(wOOtSpadeID, toolwOOt).setIconCoord(1, 5).setItemName("wOOtSpade");
	  	    wOOtAxe = new Axe(wOOtAxeID, toolwOOt).setIconCoord(1, 7).setItemName("wOOtAxe");
	  	    wOOtHoe = new Hoe(wOOtHoeID, toolwOOt).setIconCoord(1, 8).setItemName("wOOtHoe");
	  	    wOOtSword = new Sword(wOOtSwordID, toolwOOt).setIconCoord(1, 4).setItemName("wOOtSword");
	  	   //Armor.
	  	    wOOtHelmet = new Armor(wOOtHelmID, armorwOOt, ModLoader.addArmor("wOOt"), 0).setIconCoord(1,0).setItemName("wOOtHelmet");
	  	    wOOtBody = new Armor(wOOtPlateID, armorwOOt, ModLoader.addArmor("wOOt"), 1).setIconCoord(1, 1).setItemName("wOOtChestplate");
	  	    wOOtLegs = new Armor(wOOtLegsID, armorwOOt, ModLoader.addArmor("wOOt"), 2).setIconCoord(1, 2).setItemName("wOOtLeggings");
	  	    wOOtBoots = new Armor(wOOtBootsID, armorwOOt, ModLoader.addArmor("wOOt"), 3).setIconCoord(1, 3).setItemName("wOOtBoots");
	  	  //*/ 
	  	 //Temp. placeholder. 
	  	   //Eldum.
	  	    EldumPick = new Pickaxe(EldumPickID, toolELDUM).setIconCoord(2, 6).setItemName("EldumPick");
	  	    EldumSpade = new Spade(EldumSpadeID, toolELDUM).setIconCoord(2, 5).setItemName("EldumSpade");
	  	    EldumAxe = new Axe(EldumAxeID, toolELDUM).setIconCoord(2, 7).setItemName("EldumAxe");
	  	    EldumHoe = new Hoe(EldumHoeID, toolELDUM).setIconCoord(2, 8).setItemName("EldumHoe");
	  	    EldumSword = new Sword(EldumSwordID, toolELDUM).setIconCoord(2, 4).setItemName("EldumSword");
	  	    EldumBar = (new Ingot(EldumBarID, false)).setIconCoord(2, 9).setItemName("EldumBar");
	  	    EldumOre = new BlockMineral(EldumOreID, 4).setHardness(3F).setBlockName("BlockEldumOre");
	  	    EldumBlock = new BlockMineral(EldumBlockID, 5).setHardness(3F).setBlockName("EldumBlock");
	  	    EldumHelmet = new Armor(EldumHelmID, armorELDUM, ModLoader.addArmor("Eldum"), 0).setIconCoord(2, 0).setItemName("EldumHelmet");
	  	    EldumBody = new Armor(EldumPlateID, armorELDUM, ModLoader.addArmor("Eldum"), 1).setIconCoord(2, 1).setItemName("EldumChestplate");
	  	    EldumLegs = new Armor(EldumLegsID, armorELDUM, ModLoader.addArmor("Eldum"), 2).setIconCoord(2, 2).setItemName("EldumLeggings");
	  	    EldumBoots = new Armor(EldumBootsID, armorELDUM, ModLoader.addArmor("Eldum"), 3).setIconCoord(2, 3).setItemName("EldumBoots");
	  	  //  nSnor = new Armor(nSnorID, armorSNOR1, ModLoader.addArmor("moustache"), 0).setIconCoord(0, 0).setItemName("nSnor");
	  	   // itSnor = new Armor(itSnorID, armorSNOR1, ModLoader.addArmor("moustache"), 0).setIconCoord(0, 0).setItemName("itSnor");
	  	   
	  	   // jungleportal = new BlockJunglePortal(220).setHardness(-1F).setStepSound(Block.soundGlassFootstep).setLightValue(0.75F).setBlockName("DesertPortal");

	  	   
	  	   //Food update.
	  	    CWood = new Wood(CWoodID, 0).setHardness(2.0F).setStepSound(soundWoodFootstep).setBlockName("BlockCocoalog").setRequiresSelfNotify();
	  	    CLeaves = new Leaves(CLeavesID, CacaoTexture).setHardness(0.2F).setLightOpacity(1).setStepSound(soundGrassFootstep).setBlockName("BlockCocoaleaves").setRequiresSelfNotify();
	  	    CSapling = new Sapling(CSaplingID, 6).setHardness(3F).setLightOpacity(1).setHardness(0.0F).setStepSound(soundGrassFootstep).setBlockName("BlockCocoasapling").setRequiresSelfNotify();
	  	    CPlanks = new Planks(CPlanksID, 5).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setBlockName("BlockCocoaplanks").setRequiresSelfNotify();
	  	    mbtop = (new MBParts(MBTopID)).setIconCoord(1, 0).setItemName("RanikBar");
	  	    mbbottom = (new MBParts(MBbotID)).setIconCoord(2, 0).setItemName("RanikBar");
	  	    MobsBane = new MagicSword(MobsBaneID, toolELDUM).setIconCoord(3, 0).setItemName("EldumSword");
  	        
	  	  donut = (new Food(DonutID, 10, 10F, true)).setIconCoord(7, 0).setItemName("Donut");
	  	     Sdonut = (new Food(SDonutID, 15, 15F, true)).setIconCoord(8, 0).setItemName("SDonut");
	  	      Cdonut = (new Food(CDonutID, 15, 15F, true)).setIconCoord(9, 0).setItemName("CDonut");
	 // 	    Wpane = new Pane(255, 0, 1, Material.wood, true).setHardness(0.1F).setStepSound(soundWoodFootstep).setBlockName("BlockCocoalog").setRequiresSelfNotify();
		  	tomatoplant = new Crops(tomatoPlantsID, 16, 0).setHardness(0.05F).setStepSound(soundGrassFootstep).setBlockName("Blocktomatocrops").setRequiresSelfNotify().disableStats();
		  	tomato = (new Food(tomatoID, 4, 10F, true)).setIconCoord(10, 0).setItemName("tomato");
		  	tomatoSeed = (new Seeds(tomatoSeedID, mod_maccie.tomatoPlantsID, 60)).setIconCoord(11, 0).setItemName("tomatoseeds");
	  	    
			  
	  	   if (Testcode == 615154)
	  	   {
	  		   
	  	//	 thunder = (new Thunderbolt(ThunderboltID)).setIconCoord(0, 0).setItemName("THBolt");
		  	

	  		   
	  	   }

		    
	   
	   ModLoader.registerEntityID(EntityThunderbolt.class, "Thunderbolt", ModLoader.getUniqueEntityId()); 
	   
	   
	   mc = ModLoader.getMinecraftInstance();
	   ModLoader.setInGUIHook(this, true, false);
	   ModLoader.setInGameHook(this, true, false);
	        	Recipes.addRecipes();
	        	Recipes.addSmelting();
	        	Forge.addForgeBlocks();
	        	Forge.addForgeTextures();
	        	Forge.addForgeTools();
	        	Forge.addBonemeal();
	        	Register.registerAll();
	        	Names.addNames();
	        	// DimensionManager.registerDimension( 35, new WorldProviderSurface(), true);
	        	
	        	UMCore.addMod(this);
	        	
	        	if (Testcode == 615154)
	        	{
	        		
	        		betatester();


			    //  ModLoader.registerBlock(mod_maccie.Wpane);
	        		
	        	}

 	   		/*ModLoader.addName(donut, "Donut");
 	    	ModLoader.addRecipe(new ItemStack(Sdonut, 1), new Object [] {
   				"xvx", "v v", "xvx", Character.valueOf('v'), Item.wheat, Character.valueOf('x'), Item.sugar	} ); 
   			ModLoader.addRecipe(new ItemStack(donut, 1), new Object [] {
   				" v ", "v v", " v ", Character.valueOf('v'), Item.wheat, Character.valueOf('x'), Item.sugar	} ); 
   			ModLoader.addRecipe(new ItemStack(Cdonut, 1), new Object [] {
   				"xvx", "v v", "xvx", Character.valueOf('v'), new ItemStack(Item.dyePowder, 1, 3), Character.valueOf('x'), Item.sugar	} ); 
   			*/
   }
   public static int tomatoRenderID;
   public static int tomatoTexture;
   
   public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
   {
   if (l == tomatoRenderID)
   {
   return RenderTomato(block, i, j, k, renderblocks);
   }
   return false;
   }
   public boolean RenderTomato(Block block, int i, int j, int k, RenderBlocks renderblocks)
   {

	   block.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	   return true;
	   
	   
   }

   public void betatester()
   {

    	 }

   
   
   public mod_maccie()
   {
	   
   }
   
  public MinecraftForge forge;
   
   
   
   public boolean onTickInGame(float f, Minecraft minecraft)
   {
	   
	   
	   if(lodestonetp == 1)
 	   {
 		   //minecraft.displayGuiScreen(new Guilodetp(this, minecraft));
 	   }
	   //System.out.println(lodestonetp);
       return true;
   }
   public static int lodestonetp = 0;
   public BiomeGenJungle BiomeJunglegen;
   
   
   
   
   
public static World world; 

//public static Props Lodeprops = new Props((new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/saves/")/*.append(world.getWorldInfo().getWorldName()).append("/")*/.append("Lodestonecoords.props").toString())).getPath());
//public static Props Baseprops = new Props((new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/config/").append("maccie/").append("config.cfg").toString())).getPath());


@MLProp(name="RanikOreID", info="ID of the Ranik ore block", min=0, max=255)
public static int RanikOreID = 212;
@MLProp(name="RanikBlockID", info="ID of the Ranik block", min=0, max=255)
public static int RanikBlockID = 229;

@MLProp(name="wOOtOreID", info="ID of the wOOt ore block", min=0, max=255)
public static int wOOtOreID = 213;
@MLProp(name="wOOtBlockID", info="ID of the wOOt block", min=0, max=255)
public static int wOOtBlockID = 228;

@MLProp(name="EldumOreID", info="ID of the Eldum ore block", min=0, max=255)
public static int EldumOreID = 233;
@MLProp(name="EldumBlockID", info="ID of the Eldum block", min=0, max=255)
public static int EldumBlockID = 234;

@MLProp(name="RanikPickID", info="Ranik Pickaxe ID", min=0, max=2255)
public static int RanikPickID = 1000;
@MLProp(name="RanikSpadeID", info="Ranik Shovel ID", min=0, max=2255)
public static int RanikSpadeID = 1001;
@MLProp(name="RanikAxeID", info="Ranik Axe ID", min=0, max=2255)
public static int RanikAxeID = 1002;
@MLProp(name="RanikHoeID", info="Ranik Hoe ID", min=0, max=2255)
public static int RanikHoeID = 1003;
@MLProp(name="RanikSwordID", info="Ranik Sword ID", min=0, max=2255)
public static int RanikSwordID = 1004;
@MLProp(name="RanikBarID", info="Ranik Ingot ID", min=0, max=2255)
public static int RanikBarID = 1005;
@MLProp(name="RanikHelmID", info="Ranik Helmet ID", min=0, max=2255)
public static int RanikHelmID = 1006;
@MLProp(name="RanikPlateID", info="Ranik Chestplate ID", min=0, max=2255)
public static int RanikPlateID = 1007;
@MLProp(name="RanikLegsID", info="Ranik Legs ID", min=0, max=2255)
public static int RanikLegsID = 1008;
@MLProp(name="RanikBootsID", info="Ranik Boots ID", min=0, max=2255)
public static int RanikBootsID = 1009;

@MLProp(name="wOOtPickID", info="wOOt Pickaxe ID", min=0, max=2255)
public static int wOOtPickID = 1010;
@MLProp(name="wOOtSpadeID", info="wOOt Shovel ID", min=0, max=2255)
public static int wOOtSpadeID = 1011;
@MLProp(name="wOOtAxeID", info="wOOt Axe ID", min=0, max=2255)
public static int wOOtAxeID = 1012;
@MLProp(name="wOOtHoeID", info="wOOt Hoe ID", min=0, max=2255)
public static int wOOtHoeID = 1013;
@MLProp(name="wOOtSwordID", info="wOOt Sword ID", min=0, max=2255)
public static int wOOtSwordID = 1014;
@MLProp(name="wOOtBarID", info="wOOty ID", min=0, max=2255)
public static int wOOtyID = 1015;
@MLProp(name="wOOtHelmID", info="wOOt Helmet ID", min=0, max=2255)
public static int wOOtHelmID = 1016;
@MLProp(name="wOOtPlateID", info="wOOt Chestplate ID", min=0, max=2255)
public static int wOOtPlateID = 1017;
@MLProp(name="wOOtLegsID", info="wOOt Legs ID", min=0, max=2255)
public static int wOOtLegsID = 1018;
@MLProp(name="wOOtBootsID", info="wOOt Boots ID", min=0, max=2255)
public static int wOOtBootsID = 1019;

@MLProp(name="EldumPickID", info="Eldum Pickaxe ID", min=0, max=2255)
public static int EldumPickID = 1020;
@MLProp(name="EldumSpadeID", info="Eldum Shovel ID", min=0, max=2255)
public static int EldumSpadeID = 1021;
@MLProp(name="EldumAxeID", info="Eldum Axe ID", min=0, max=2255)
public static int EldumAxeID = 1022;
@MLProp(name="EldumHoeID", info="Eldum Hoe ID", min=0, max=2255)
public static int EldumHoeID = 1023;
@MLProp(name="EldumSwordID", info="Eldum Sword ID", min=0, max=2255)
public static int EldumSwordID = 1024;
@MLProp(name="EldumBarID", info="Eldum Ingot ID", min=0, max=2255)
public static int EldumBarID = 1025;
@MLProp(name="EldumHelmID", info="Eldum Helmet ID", min=0, max=2255)
public static int EldumHelmID = 1026;
@MLProp(name="EldumPlateID", info="Eldum Chestplate ID", min=0, max=2255)
public static int EldumPlateID = 1027;
@MLProp(name="EldumLegsID", info="Eldum Legs ID", min=0, max=2255)
public static int EldumLegsID = 1028;
@MLProp(name="EldumBootsID", info="Eldum Boots ID", min=0, max=2255)
public static int EldumBootsID = 1029;

@MLProp(name="LoempiaID", info="Loempia ID", min=0, max=2255)
public static int LoempiaID = 1500;
@MLProp(name="RawLoempiaID", info="Raw Loempia ID", min=0, max=2255)
public static int RawLoempiaID = 1501;
@MLProp(name="LoempiaSwordID", info="Loempia-Sword ID", min=0, max=2255)
public static int LoempiaSwordID = 1502;

@MLProp(name="DonutID", info="Donut ID", min=0, max=2255)
public static int DonutID = 1503;
@MLProp(name="SDonutID", info="Sugared Donut ID", min=0, max=2255)
public static int SDonutID = 1504;
@MLProp(name="CDonutID", info="Choco-donut ID", min=0, max=2255)
public static int CDonutID = 1505;
@MLProp(name="tomatoID", info="Tomato ID", min=0, max=2255)
public static int tomatoID = 1506;
@MLProp(name="tomatoSeedID", info="Tomato seeds ID", min=0, max=2255)
public static int tomatoSeedID = 1507;


@MLProp(name="CWoodID", info="ID of the Cocoa logs", min=0, max=255)
public static int CWoodID = 235;
@MLProp(name="CleavesID", info="ID of the Cocoa-Leaves", min=0, max=255)
public static int CLeavesID = 236;
@MLProp(name="CSaplingID", info="ID of the Cocoa sapling", min=0, max=255)
public static int CSaplingID = 237;
@MLProp(name="CPlanksID", info="ID of the Cocoa plank", min=0, max=255)
public static int CPlanksID = 238;
@MLProp(name="TPlantsID", info="ID of the Tomato-crops", min=0, max=255)
public static int tomatoPlantsID = 239;

@MLProp(name="ThunderboltID", info="Thunderbolt ID", min=0, max=2255)
public static int ThunderboltID = 1250;

@MLProp(name="Testcode", info="Authencation code for if you are selected for testing", min=0, max=999999999)
public static int Testcode = 0;

@MLProp(name="Graphics", info="Fancy or fast custom tree textures's, 1=fast, 0=fancy", min=0, max=1)
public static int Graphics = 0;

@MLProp(name="MBBottomID", info="Mobs Bane Bottom ID", min=0, max=2255)
public static int MBbotID = 1253;
@MLProp(name="MBTopID", info="Mobs Bane Top ID", min=0, max=2255)
public static int MBTopID = 1252;
@MLProp(name="MobsBaneID", info="Mobs-Bane ID", min=0, max=2255)
public static int MobsBaneID = 1251;

public static int CacaoTexture;


   static
   {
/**
 * 
 * 
 */
	   

	   
	   
	   
/**
 * 
 * 	   
 */
	   
	   //GreenZ = mod_maccie.Lodeprops.getInt("GreenZ");
	   
	   
	   
	   
	   
   }

   
   
   //public static int GreenX = mod_maccie.Lodeprops.getInt("GreenX");
 //  public static int GreenY = mod_maccie.Lodeprops.getInt("GreenY");
 //  public static int GreenZ = mod_maccie.Lodeprops.getInt("GreenZ");
   
   

   

   
   
   
 //  public static void prepareProps()
 //  {
	   
	   
	/*   
   Lodeprops.getInt("GreenX", 0);
   Lodeprops.getInt("GreenY", 64);
   Lodeprops.getInt("GreenZ", 0);
   
   Lodeprops.getInt("RedX", 0);
   Lodeprops.getInt("RedX", 64);
   Lodeprops.getInt("RedZ", 0);
   
  
   Baseprops.m("Tester", false);
   Baseprops.getInt("Tester-code", 0);
   
   Baseprops.getInt("Ranik_Ore", 212);
   Baseprops.getInt("Ranik_Block", 229);
   Baseprops.getInt("wOOt_Ore", 213);
   Baseprops.getInt("wOOt_Block", 228);
   Baseprops.getInt("Eldum_Ore", 233);
   Baseprops.getInt("Eldum_Block", 234);
   
   Baseprops.getInt("Ranik_Ingot", 1000);
   Baseprops.getInt("Ranik_Helmet", 1001);
   Baseprops.getInt("Ranik_Chestplate", 1002);
   Baseprops.getInt("Ranik_Legs", 1003);
   Baseprops.getInt("Ranik_Boots", 1004);
   Baseprops.getInt("Ranik_Pickaxe", 1005);
   Baseprops.getInt("Ranik_Hoe", 1006);
   Baseprops.getInt("Ranik_Sword", 1007);
   Baseprops.getInt("Ranik_Axe", 1008);
   Baseprops.getInt("Ranik_Shovel", 1009);
   
   Baseprops.getInt("wOOty", 1010);
   Baseprops.getInt("wOOt_Helmet", 1011);
   Baseprops.getInt("wOOt_Chestplate", 1012);
   Baseprops.getInt("wOOt_Legs", 1013);
   Baseprops.getInt("wOOt_Boots", 1014);
   Baseprops.getInt("wOOt_Pickaxe", 1015);
   Baseprops.getInt("wOOt_Hoe", 1016);
   Baseprops.getInt("wOOt_Sword", 1017);
   Baseprops.getInt("wOOt_Axe", 1018);
   Baseprops.getInt("wOOt_Shovel", 1019);
   
   Baseprops.getInt("Eldum_Ingot", 1020);
   Baseprops.getInt("Eldum_Helmet", 1021);
   Baseprops.getInt("Eldum_Chestplate", 1022);
   Baseprops.getInt("Eldum_Legs", 1023);
   Baseprops.getInt("Eldum_Boots", 1024);
   Baseprops.getInt("Eldum_Pickaxe", 1025);
   Baseprops.getInt("Eldum_Hoe", 1026);
   Baseprops.getInt("Eldum_Sword", 1027);
   Baseprops.getInt("Eldum_Axe", 1028);
   Baseprops.getInt("Eldum_Shovel", 1029);
   
   Baseprops.getInt("Cocoa_Logs", 205);
   Baseprops.getInt("Cocoa_Leaves", 206);
   Baseprops.getInt("Cocoa_Fruit", 208);
   Baseprops.getInt("Cocoa_Sapling", 207);
   Baseprops.getInt("Cocoa_Planks", 208);
   
   Baseprops.getInt("Donut", 1107);
   Baseprops.getInt("Choco_Donut", 1108);
   Baseprops.getInt("Sugar_Donut", 1109);
   
   Baseprops.getInt("Loempia", 1100);
   Baseprops.getInt("Raw_Loempia", 1101);
   Baseprops.getInt("Loempia_Sword", 1102);*/

   
   
 //  }
   

   
   
   
//, Character.valueOf('P'), new ItemStack(Item.potion, 1, 5)
//.setPotionEffect(Potion.poison.id, 15, 0, 1.0F)   
 

   
   

}