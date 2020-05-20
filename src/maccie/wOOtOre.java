package net.minecraft.src.maccie;

import java.util.*;
import net.minecraft.src.*;

import net.minecraft.src.forge.ITextureProvider;

public class wOOtOre extends Block implements ITextureProvider

{

    public wOOtOre(int i, int j, Material material)
    {
        super(i, j, Material.iron);
    }

    public int idDropped(int i, Random random, int j)
    {
        return mod_maccie.wOOty.shiftedIndex;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }
    public String getTextureFile()
    {
            return "/maccie/mod/blocks/ores.png";
    }
}