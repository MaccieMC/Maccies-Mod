package net.minecraft.src.maccie;
import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.Configuration;

public class IDProperty {

    public static void initProps()
    {
        /* Here we will set up the config file for the mod 
         * First: Create a folder inside the config folder
         * Second: Create the actual config file
         * Note: Configs are a pain, but absolutely necessary for every mod.
         */

        File file = new File(Minecraft.getMinecraftDir() + "/config/maccie/");
        file.mkdir();
        File newFile = new File(Minecraft.getMinecraftDir() + "/config/maccie/mod/idconfig.cfg");

        /* Some basic debugging will go a long way */
        try
        {
            newFile.createNewFile();
            System.out.println("Successfully created/read configuration file");
        }
        catch (IOException e)
        {
            System.out.println("Could not create configuration file for mod_maccie. Reason:");
            System.out.println(e);
        }

        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(new File(Minecraft.getMinecraftDir() + "/config/maccie/mod/idconfig.cfg"));

        /* Load the configuration file */
        config.load();

        /* Define the mod's IDs. 
         * Avoid values below 4096 for items and in the 250600 range for blocks
         */
         RanikOreID = config.getOrCreateIntProperty("Ranik Ore", "block", 212).getInt(212);
        RanikID = config.getOrCreateIntProperty("Ranik Block", "block", 229).getInt(229);
        wOOtOreID = config.getOrCreateIntProperty("wOOt Ore", "block", 213).getInt(213);
        wOOtID = config.getOrCreateIntProperty("wOOt Block", "block", 228).getInt(228);
        EldumOreID = config.getOrCreateIntProperty("Eldum Ore", "block", 233).getInt(233);
        EldumID = config.getOrCreateIntProperty("Eldum Block", "block", 234).getInt(234);
        
        RanikBarID = config.getOrCreateIntProperty("Ranik Ingot", "item", 211).getInt(211);
        wOOtyID = config.getOrCreateIntProperty("wOOty", "item", 227).getInt(277);
        EldumBarID = config.getOrCreateIntProperty("Eldum Ingot", "item", 1085).getInt(1085);
        //Armor
        RanikHelmID = config.getOrCreateIntProperty("Ranik Helmet", "item", 214).getInt(214);
        RanikBodyID = config.getOrCreateIntProperty("Ranik Chestplate", "item", 215).getInt(215);
        RanikLegsID = config.getOrCreateIntProperty("Ranik Legplates", "item", 216).getInt(216);
        RanikBootsID = config.getOrCreateIntProperty("Ranik Boots", "item", 217).getInt(217);
        
        wOOtHelmID = config.getOrCreateIntProperty("wOOt Helmet", "item", 223).getInt(223);
        wOOtBodyID = config.getOrCreateIntProperty("wOOt Chestplate", "item", 224).getInt(224);
        wOOtLegsID = config.getOrCreateIntProperty("wOOt Legplates", "item", 225).getInt(225);
        wOOtBootsID = config.getOrCreateIntProperty("wOOt Boots", "item", 226).getInt(226);
        
        EldumHelmID = config.getOrCreateIntProperty("Eldum Helmet", "item", 1088).getInt(1088);
        EldumBodyID = config.getOrCreateIntProperty("Eldum Chestplate", "item", 1089).getInt(1089);
        EldumLegsID = config.getOrCreateIntProperty("Eldum Legplates", "item", 1090).getInt(1090);
        EldumBootsID = config.getOrCreateIntProperty("Eldum Boots", "item", 1091).getInt(1091);
        //Tools
        RanikPickID = config.getOrCreateIntProperty("Ranik Pickaxe", "item", 206).getInt(206);
        RanikAxeID = config.getOrCreateIntProperty("Ranik Axe", "item", 208).getInt(208);
        RanikSpadeID = config.getOrCreateIntProperty("Ranik Shovel", "item", 207).getInt(207);
        RanikHoeID = config.getOrCreateIntProperty("Ranik Hoe", "item", 209).getInt(209);
        RanikSwordID = config.getOrCreateIntProperty("Ranik Sword", "item", 210).getInt(210);
        
        wOOtPickID = config.getOrCreateIntProperty("wOOt Pickaxe", "item", 218).getInt(218);
        wOOtAxeID = config.getOrCreateIntProperty("wOOt Axe", "item", 220).getInt(220);
        wOOtSpadeID = config.getOrCreateIntProperty("wOOt Shovel", "item", 219).getInt(219);
        wOOtHoeID = config.getOrCreateIntProperty("wOOt Hoe", "item", 221).getInt(221);
        wOOtSwordID = config.getOrCreateIntProperty("wOOt Sword", "item", 222).getInt(222);
        
        EldumPickID = config.getOrCreateIntProperty("Eldum Pickaxe", "item", 1080).getInt(1080);
        EldumAxeID = config.getOrCreateIntProperty("Eldum Axe", "item", 1082).getInt(1082);
        EldumSpadeID = config.getOrCreateIntProperty("Eldum Shovel", "item", 1081).getInt(1081);
        EldumHoeID = config.getOrCreateIntProperty("Eldum Hoe", "item", 1083).getInt(1083);
        EldumSwordID = config.getOrCreateIntProperty("Eldum Sword", "item", 1084).getInt(1084);
        
        RawLoempiaID = config.getOrCreateIntProperty("Uncooked Loempia", "item", 1094).getInt(1094);
        LoempiaID = config.getOrCreateIntProperty("Loempia", "item", 1092).getInt(1092);
        LoempiaswordID = config.getOrCreateIntProperty("Loempia Sword", "item", 1093).getInt(1093);
        
       // nSnorID = config.getOrCreateIntProperty("Normal moustache", "item", 1095).getInt();
      //  nSnorID = config.getOrCreateIntProperty("Italian moustache", "item", 1096).getInt();
        
        CWoodID = config.getOrCreateIntProperty("Cocoatree logs", "block", 235).getInt(235);
        CLeavesID = config.getOrCreateIntProperty("Cocoatree Leaves", "block", 236).getInt(236);
        CSaplingID = config.getOrCreateIntProperty("CocoatreeSapling", "block", 237).getInt(237);
        CocoaID = config.getOrCreateIntProperty("Cocoatree fruit", "block", 238).getInt(238);
        
        cDonutID = config.getOrCreateIntProperty("Chocolade Donut", "item", 1202).getInt(1202);
        sDonutID = config.getOrCreateIntProperty("Sugar donut", "item", 1201).getInt(1201);
        donutID = config.getOrCreateIntProperty("Normal Donut", "item", 1200).getInt(1200);
        
        
        
        
        /* Save the configuration file */
        config.save();
    }

    /* Prototype fields, used elsewhere */

    public static int copperOreID;
    public static int copperPickaxeID;
    public static int copperIngotID;
    
  //Blocks
    public static int RanikOreID;
    public static int RanikID;
    public static int wOOtOreID;
    public static int wOOtID;
    public static int EldumOreID;
    public static int EldumID;
    //Armor
    public static int RanikBarID;
    public static int wOOtyID;
    public static int EldumBarID;
    
    public static int RanikHelmID;
    public static int RanikBodyID;
    public static int RanikLegsID;
    public static int RanikBootsID;
    
    public static int wOOtHelmID;
    public static int wOOtBodyID;
    public static int wOOtLegsID;
    public static int wOOtBootsID;
    
    public static int EldumHelmID;
    public static int EldumBodyID;
    public static int EldumLegsID;
    public static int EldumBootsID;
    //Tools 
    public static int RanikPickID;
    public static int RanikAxeID;
    public static int RanikSpadeID;
    public static int RanikSwordID;
    public static int RanikHoeID;
    
    public static int wOOtPickID;
    public static int wOOtAxeID;
    public static int wOOtSpadeID;
    public static int wOOtSwordID;
    public static int wOOtHoeID;
    
    public static int EldumPickID;
    public static int EldumAxeID;
    public static int EldumSpadeID;
    public static int EldumSwordID;
    public static int EldumHoeID;
    
    public static int RawLoempiaID;
    public static int LoempiaID;
    public static int LoempiaswordID;
    
   // public static int nSnorID;
   // public static int itSnorID;
    
    public static int CLeavesID;
    public static int CWoodID;
    public static int CocoaID;
    public static int CSaplingID;
    public static int CPlanksID;
    
    public static int sDonutID;
    public static int cDonutID;
    public static int donutID;
}