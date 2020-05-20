package net.minecraft.src.maccie;

import java.util.*;

import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;

public class Wood extends Block implements ITextureProvider
{

    public Wood(int i, int j)
    {
    	super(i, j, Material.wood);
    }
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }

   // public int quantityDropped(Random random)
    //{
     //   return 1;
    //}

    //public int idDropped(int i, Random random)
    //{
      //  return mod_maccie.CocoaWood.blockID;
    //}

    public int getBlockTextureFromSide(int i)
    {
        if(i == 1 || i == 0)
        {
            return baseIndexInPNG + 1;
        } else
        {
            return baseIndexInPNG;
        }
    }

    private int baseIndexInPNG;

	public String getTextureFile() {

        return "/maccie/mod/blocks/plants.png";
	}
}