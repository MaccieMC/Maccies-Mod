package net.minecraft.src.maccie;

import java.util.*;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class Sapling extends BlockFlower implements ITextureProvider
{

    public Sapling(int i, int j)
    {
        super(i, j);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }
    public void addCreativeItems(ArrayList itemList)
    {
            itemList.add(new ItemStack(this));
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if(world.isRemote)
        {
            return;
        }
        super.updateTick(world, i, j, k, random);
        if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(30) == 0)
        {
            int l = world.getBlockMetadata(i, j, k);
            if((l & 8) == 0)
            {
                world.setBlockMetadataWithNotify(i, j, k, l | 8);
            } else
            {
                growTree(world, i, j, k, random);
            }
        }
    }

    public void growTree(World world, int i, int j, int k, Random random)
    {
        int l = world.getBlockMetadata(i, j, k) & 3;
        world.setBlock(i, j, k, 0);
        Object obj = null;
        if(l == 1)
        {
            obj = new WorldGenTaiga2(true);
        } else
        if(l == 2)
        {
            obj = new WorldGenForest(true);
        } else
        {
            obj = new WorldGenCocoaTrees();
            
        }
        if(!((WorldGenerator) (obj)).generate(world, random, i, j, k))
        {
            world.setBlockAndMetadata(i, j, k, blockID, l);
        }
    }

    public int idDropped(int i, Random random)
    {
        return mod_maccie.CSapling.blockID;
    }

	public String getTextureFile() {

        return "/maccie/mod/blocks/plants.png";
	}
}