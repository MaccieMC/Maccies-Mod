package net.minecraft.src.maccie;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

import java.util.Random;
import java.util.ArrayList;

public class Crops extends BlockFlower implements ITextureProvider
{
    public Crops(int par1, int par2, int type)
    {
        super(par1, par2);
        this.typen = type;
        this.blockIndexInTexture = par2;
        this.setTickRandomly(true);
        float var3 = 0.5F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
    }
    public static int typen;

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.tilledField.blockID;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            int var6 = par1World.getBlockMetadata(par2, par3, par4);

            if (var6 < 8)
            {
                float var7 = this.getGrowthRate(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(25.0F / var7) + 1) == 0)
                {
                    ++var6;
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
                }
            }
        }
    }

    /**
     * Apply bonemeal to the crops.
     */
    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        par1World.setBlockMetadataWithNotify(par2, par3, par4, 8);
    }

    /**
     * Gets the growth rate for the crop. Setup to encourage rows by halving growth rate if there is diagonals, crops on
     * different sides that aren't opposing, and by adding growth for every crop next to this one (and for crop below
     * this one). Args: x, y, z
     */
    private float getGrowthRate(World par1World, int par2, int par3, int par4)
    {
        float var5 = 1.0F;
        int var6 = par1World.getBlockId(par2, par3, par4 - 1);
        int var7 = par1World.getBlockId(par2, par3, par4 + 1);
        int var8 = par1World.getBlockId(par2 - 1, par3, par4);
        int var9 = par1World.getBlockId(par2 + 1, par3, par4);
        int var10 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
        int var11 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
        int var12 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
        int var13 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
        boolean var14 = var8 == this.blockID || var9 == this.blockID;
        boolean var15 = var6 == this.blockID || var7 == this.blockID;
        boolean var16 = var10 == this.blockID || var11 == this.blockID || var12 == this.blockID || var13 == this.blockID;

        for (int var17 = par2 - 1; var17 <= par2 + 1; ++var17)
        {
            for (int var18 = par4 - 1; var18 <= par4 + 1; ++var18)
            {
                int var19 = par1World.getBlockId(var17, par3 - 1, var18);
                float var20 = 0.0F;

                if (var19 == Block.tilledField.blockID)
                {
                    var20 = 0.75F;

                    if (par1World.getBlockMetadata(var17, par3 - 1, var18) > 0)
                    {
                        var20 = 2.0F;
                    }
                }

                if (var17 != par2 || var18 != par4)
                {
                    var20 /= 4.0F;
                }

                var5 += var20;
            }
        }

        if (var16 || var14 && var15)
        {
            var5 /= 2.0F;
        }

        return var5;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        if (par2 < 0)
        {
            par2 = 7;
        }

        return this.blockIndexInTexture + par2;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 6;
    }

    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if (metadata == 8)
        {
            ret.add(new ItemStack(mod_maccie.tomato));
        }
        
        for (int n = 0; n < 3 + fortune; n++)
        {
            if (world.rand.nextInt(15) <= metadata)
            {
                ret.add(new ItemStack(mod_maccie.tomatoSeed));
            }
        }
        
        return ret;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 7 ? Item.wheat.shiftedIndex : -1;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    


    /**
     * make a sheep sheared if set to true
     */
    
    

    
    public boolean blockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
       
        	
        	int damage = par1World.getBlockMetadata(par2, par3, par4);	
        	
        	if (damage == 8)
        	{
        		int tomatoID = mod_maccie.tomatoID + 256;
        		int tomatoSeedID = mod_maccie.tomatoSeedID + 256;
        		int tomatoseeds = par1World.rand.nextInt(3);
        		
            	float var8 = 0.7F;
                par1World.setBlockMetadataWithNotify(par2, par3, par4, 4);
                double var9 = (double)(par1World.rand.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
                double var11 = (double)(par1World.rand.nextFloat() * var8) + (double)(1.0F - var8) * 0.2D + 0.6D;
                double var13 = (double)(par1World.rand.nextFloat() * var8) + (double)(1.0F - var8) * 0.5D;
                
                EntityItem var15 = new EntityItem(par1World, (double)par2 + var9, (double)par3 + var11, (double)par4 + var13, new ItemStack(tomatoID, 3, 0));
                if (tomatoseeds == 1);
                {
                EntityItem var16 = new EntityItem(par1World, (double)par2 + var9, (double)par3 + var11, (double)par4 + var13, new ItemStack(tomatoSeedID, tomatoseeds, 0));
                var16.delayBeforeCanPickup = 11;
                par1World.spawnEntityInWorld(var16);
                }
                var15.delayBeforeCanPickup = 10;
                par1World.spawnEntityInWorld(var15);

                
            

            return true;
        	}
        	else
        	{
        		return false;
        	}
        }
    }

    



    


	public String getTextureFile() {

        return "/maccie/mod/blocks/plants.png";
	}
}
