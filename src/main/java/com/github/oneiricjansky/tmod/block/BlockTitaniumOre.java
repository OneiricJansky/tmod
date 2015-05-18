package com.github.oneiricjansky.tmod.block;

import com.github.oneiricjansky.tmod.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block
{
        public BlockTitaniumOre()
        {
                super(Material.iron);
                setBlockName("titaniumOre");
        		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));

                setCreativeTab(CreativeTabs.tabBlock);
        }
}
