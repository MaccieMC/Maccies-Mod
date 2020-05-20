package net.minecraft.src.maccie;
import java.util.*;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class Planks extends Block implements ITextureProvider
{
    public Planks(int i, int j)
    {
        super(i, j, Material.wood);
    }


	public String getTextureFile() {

        return "/maccie/mod/blocks/plants.png";
	}
	 public void addCreativeItems(ArrayList itemList)
     {
             itemList.add(new ItemStack(this));
     }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */

}
