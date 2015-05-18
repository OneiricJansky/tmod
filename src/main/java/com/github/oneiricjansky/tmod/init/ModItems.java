package com.github.oneiricjansky.tmod.init;

import com.github.oneiricjansky.tmod.help.RegisterHelper;
import com.github.oneiricjansky.tmod.items.TModItem;

import net.minecraft.item.Item;

public class ModItems {
	
	
	public static Item ebonyIngot = new TModItem().setUnlocalizedName("ebonyIngot");
	
    public static void init()
    {
    	RegisterHelper.registerItem(ebonyIngot);
    }


}
