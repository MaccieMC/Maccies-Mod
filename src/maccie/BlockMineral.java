package net.minecraft.src.maccie;

import java.util.*;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BlockMineral extends Block implements ITextureProvider

{

    public BlockMineral(int i, int j)
    {
        super(i, j, Material.iron);
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