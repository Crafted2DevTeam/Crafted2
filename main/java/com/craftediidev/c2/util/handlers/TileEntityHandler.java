package com.craftediidev.c2.util.handlers;

import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.TileEntityMannCoCopperCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate.TileEntityMannCoEmaraldCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoSteelCrate.TileEntityMannCoSteelCrate;

import net.minecraftforge.fml.common.registry.GameRegistry;


public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityMannCoCopperCrate.class, "copper_crate");
		GameRegistry.registerTileEntity(TileEntityMannCoSteelCrate.class, "steel_crate");
		GameRegistry.registerTileEntity(TileEntityMannCoEmaraldCrate.class, "emarald_crate");

		
	
	}
}