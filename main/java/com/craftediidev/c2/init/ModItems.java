package com.craftediidev.c2.init;

import java.util.ArrayList;
import java.util.List;

import com.craftediidev.c2.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Minerals
	
	//Items
	public static final Item Ingot_Copper = new ItemBase("ingot_copper");
	public static final Item Ingot_Steel = new ItemBase("ingot_steel");
	public static final Item Carbon = new ItemBase("carbon");
	
	//Tools
	public static final Item Hammer_Wood = new ItemBase("hammer_wood");

}
