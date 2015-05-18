package com.github.oneiricjansky.tmod.init;

import com.github.oneiricjansky.tmod.block.BlockTitaniumOre;
import com.github.oneiricjansky.tmod.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	
    public static Block titaniumOre = new BlockTitaniumOre();        

    public static void init()
    {
          RegisterHelper.registerBlock(titaniumOre);
    }


}
