package net.minecraft.src.maccie;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class MagicSword extends ItemSword implements ITextureProvider
{
        
    public MagicSword(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i, enumtoolmaterial);
    }
    public EnumRarity getRarity(ItemStack itemstack)
    {
        return EnumRarity.epic;
        
    }
    
    public String getTextureFile()
    {
        return "/maccie/mod/items/magic.png";
    }

}