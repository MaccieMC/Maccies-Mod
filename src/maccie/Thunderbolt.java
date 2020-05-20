package net.minecraft.src.maccie;
import net.minecraft.src.*;
import net.minecraft.src.forge.ITextureProvider;
public class Thunderbolt extends Item implements ITextureProvider
{
    private int isMad;



	public Thunderbolt(int par1)
    {
        super(par1);
        this.maxStackSize = 16;
        this.setMaxDamage(19);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	//if(par1ItemStack.getItemDamage() == 0)
    	//{
    	
    		par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));	
    	
    	//}
    	
    	
    	
        return par1ItemStack;
    }
    
    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            par1ItemStack.damageItem(1, par3EntityPlayer);
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityThunderbolt(par2World, par3EntityPlayer));
        }
		return par1ItemStack;
    }
    
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        
    }
    
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
    
    
    public ItemStack onUpdate(ItemStack itemstack, World world, EntityPlayer entity, int i, boolean flag)
    {
        if(itemstack.getItemDamage() > 0)
        {
        	this.isMad = 400;
        	if (this.isMad == 0)
            { 
        		this.isMad = 400;
                return new ItemStack(mod_maccie.thunder, 1, 0);
            }
        	else
        	{
        		int damage = itemstack.getItemDamage();
            	if (this.isMad >= 1)
                { 
            		damage--;
            		this.isMad--;
                    return new ItemStack(mod_maccie.thunder, 1, damage);
                }
        	}
        }
        else
        {
        	return itemstack;
        }
		return itemstack;
    }
    
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 40;
    }

    
    
	public String getTextureFile() {

		return "/maccie/mod/items/magic.png";
		
	}
}
