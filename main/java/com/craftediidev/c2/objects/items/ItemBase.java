package com.craftediidev.c2.objects.items;

import com.craftediidev.c2.Main;
import com.craftediidev.c2.init.ModItems;
import com.craftediidev.c2.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.craftedtab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,  0,  "inventory");
	}

}
