package com.craftediidev.c2.init;

import com.craftediidev.c2.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(Items.FLINT, new ItemStack(ModItems.Carbon, 1), 2.0F);
	}
}
