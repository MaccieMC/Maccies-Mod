package net.minecraft.src.maccie;

import net.minecraft.src.forge.*;
import net.minecraft.src.*;

public class Spade extends ItemSpade implements ITextureProvider
{
        
    public Spade(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i, enumtoolmaterial);
    }
    
    public String getTextureFile()
    {
        return "/maccie/mod/items/tools.png";
    }

}