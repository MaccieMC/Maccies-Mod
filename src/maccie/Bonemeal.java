package net.minecraft.src.maccie;

import net.minecraft.src.*;
import net.minecraft.src.forge.*;

import java.util.Random;

public class Bonemeal implements IBonemealHandler
{
        



		public boolean onUseBonemeal(World world, int blockID, int X, int Y, int Z) {
			if(!world.isRemote)
            {
				
				
	                int var8 = world.getBlockId(X, Y, Z);
	                
	               
				
				if (blockID == mod_maccie.CSaplingID)
				{
                ((Sapling)mod_maccie.CSapling).growTree(world, X, Y, Z, world.rand);
               // ((Crops)mod_maccie.tomatoplant).fertilize(world, X, Y, Z);
                return true;

				}
				else if (blockID == mod_maccie.tomatoPlantsID)
				{
					 ((Crops)mod_maccie.tomatoplant).fertilize(world, X, Y, Z);
			            return true;

				}
            }
            return false;
		}

}