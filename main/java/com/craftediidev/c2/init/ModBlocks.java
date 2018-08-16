package com.craftediidev.c2.init;

import java.util.ArrayList;
import java.util.List;

import com.craftediidev.c2.objects.blocks.BlockBase;
import com.craftediidev.c2.objects.blocks.crates.MannCoSteelCrate.MannCoSteelCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.MannCoCopperCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate.MannCoEmaraldCrate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	public static final Block BLOCK_STEEL = new BlockBase("block_steel", Material.IRON);
	
	//Crates
	public static final Block MANN_CO_COPPER_CRATE = new MannCoCopperCrate("mann_co_copper_crate" );
	public static final Block MANN_CO_STEEL_CRATE = new MannCoSteelCrate("mann_co_steel_crate");
	public static final Block MANN_CO_EMARALD_CRATE = new MannCoEmaraldCrate("mann_co_emarald_crate");
	
	//Ores
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
}