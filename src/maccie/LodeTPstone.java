package net.minecraft.src.maccie;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class LodeTPstone extends Item
{
        public LodeTPstone(int i)
        {
                super(i);
        }
        
        public Minecraft minecraft;
        
        
        public double GreenX; //= mod_maccie.GreenX;
        public double GreenY; //= mod_maccie.GreenY;
        public double GreenZ; //= mod_maccie.GreenZ;
        
        
        
       // public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        //{
            //if (par3EntityPlayer.capabilities.depleteBuckets)
          //  {
              //  return par1ItemStack;
           //}
          /* else
            {
                --par1ItemStack.stackSize;
                
                if (!par2World.isRemote)
                {
                	GreenX = mod_maccie.GreenX;
                	
                	minecraft.thePlayer.setPositionAndUpdate(mod_maccie.GreenX, mod_maccie.GreenY, mod_maccie.GreenZ);
                	minecraft.thePlayer.fallDistance = 0.0F;
                	}

                return par1ItemStack;
            }*/
        //}
        
        
        public String getTextureFile()
        {
            return "/maccie/mod/items.png";
        }
}