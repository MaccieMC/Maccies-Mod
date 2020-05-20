package net.minecraft.src.maccie;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class MBParts extends Item implements ITextureProvider
{
        public MBParts(int i)
        {
                super(i);
        }
        
        
        public String getTextureFile()
        {
            return "/maccie/mod/items/magic.png";
        }
}