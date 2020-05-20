package net.minecraft.src.maccie;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class Armor extends ItemArmor implements ITextureProvider, IArmorTextureProvider
{

    public Armor(int i, EnumArmorMaterial enumarmormaterial, int j, int k)
    {
        super(i, enumarmormaterial, j, k);
    }
    
    public String getTextureFile()
    {
        return "/maccie/mod/items/tools.png";
    }
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if(itemstack.itemID == mod_maccie.RanikHelmet.shiftedIndex || itemstack.itemID == mod_maccie.RanikBody.shiftedIndex || itemstack.itemID == mod_maccie.RanikBoots.shiftedIndex)
        {
                return "/maccie/mod/armor/ranik_1.png";
        }
        if(itemstack.itemID == mod_maccie.RanikLegs.shiftedIndex)
        {
            return "/maccie/mod/armor/ranik_2.png";
        }
        
        if(itemstack.itemID == mod_maccie.wOOtHelmet.shiftedIndex || itemstack.itemID == mod_maccie.wOOtBody.shiftedIndex || itemstack.itemID == mod_maccie.wOOtBoots.shiftedIndex)
        {
                return "/maccie/mod/armor/wOOt_1.png";
        }
        if(itemstack.itemID == mod_maccie.wOOtLegs.shiftedIndex)
        {
            return "/maccie/mod/armor/wOOt_2.png";
        }
        
        if(itemstack.itemID == mod_maccie.EldumHelmet.shiftedIndex || itemstack.itemID == mod_maccie.EldumBody.shiftedIndex || itemstack.itemID == mod_maccie.EldumBoots.shiftedIndex)
        {
                return "/maccie/mod/armor/Eldum_1.png";
        }
        if(itemstack.itemID == mod_maccie.EldumLegs.shiftedIndex)
        {
            return "/maccie/mod/armor/Eldum_2.png";
        }
        
        return  "maccie/mod/armor/ranik_2.png";
}
}