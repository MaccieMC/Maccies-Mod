package net.minecraft.src.maccie;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class Ingot extends Item implements ITextureProvider
{
        public Ingot(int i, boolean wooty)
        {
                super(i);
        }
        
        
        public String getTextureFile()
        {
            return "/maccie/mod/items/tools.png";
        }
}