package com.craftediidev.c2.tabs;

import com.craftediidev.c2.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftedTab extends CreativeTabs
{
	public CraftedTab(String label)
	{
		super("craftedtab");
		this.setBackgroundImageName("craftedbg.png");
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.BLOCK_COPPER));
	}
}
