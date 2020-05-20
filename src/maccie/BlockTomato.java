package net.minecraft.src.maccie;

import java.util.Random;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BlockTomato extends BlockDragonEgg implements ITextureProvider

{

    public BlockTomato(int i, int j)
    {
        super(i, j);
        blockIndexInTexture = j;
    }

    public boolean blockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        return false;
    }
    
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        
    }
    
    public boolean isOpaqueCube()
    {
    return false;
    }
    
    public boolean renderAsNormalBlock()
    {
    return false;
    }
    
    public int getRenderType()
    {
    return 27;
    }
 
    
    public String getTextureFile()
    {
            return "/maccie/mod/blocks/plants.png";
    }
}