package net.minecraft.src.maccie;

import net.minecraft.src.*;

public class EntityThunderbolt extends EntityThrowable
{
	
	
	public static EntityLightningBolt EntityLightningBolt;
    public EntityThunderbolt(World par1World)
    {
        super(par1World);
    }

    public EntityThunderbolt(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntityThunderbolt(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    

    /**
     * Called when the throwable hits a block or entity.
     */

    
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        int i = par1MovingObjectPosition.blockX;
        int j = par1MovingObjectPosition.blockY;
        int k = par1MovingObjectPosition.blockZ;
        int l = par1MovingObjectPosition.sideHit;

    	if (l == 0)
        {
            j--;
        }

        if (l == 1)
        {
            j++;
        }

        if (l == 2)
        {
            k--;
        }

        if (l == 3)
        {
            k++;
        }

        if (l == 4)
        {
            i--;
        }

        if (l == 5)
        {
            i++;
        }

        worldObj.spawnEntityInWorld(new EntityLightningBolt(worldObj, i, j, k));
        setDead();
    }    
    	

    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }
    

}