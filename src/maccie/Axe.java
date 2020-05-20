package net.minecraft.src.maccie;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class Axe extends ItemAxe implements ITextureProvider
{
        
    public Axe(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i, enumtoolmaterial);
    }
    
    public String getTextureFile()
    {
        return "/maccie/mod/items/tools.png";
    }

}