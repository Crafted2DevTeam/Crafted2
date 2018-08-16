package com.craftediidev.c2.util.handlers;


import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.ContainerMannCoCopperCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.GuiMannCoCopperCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.TileEntityMannCoCopperCrate;

import com.craftediidev.c2.objects.blocks.crates.MannCoSteelCrate.ContainerMannCoSteelCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoSteelCrate.GuiMannCoSteelCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoSteelCrate.TileEntityMannCoSteelCrate;

import com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate.ContainerMannCoEmaraldCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate.GuiMannCoEmaraldCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate.TileEntityMannCoEmaraldCrate;

import com.craftediidev.c2.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler
 
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_COPPER_CRATE) return new ContainerMannCoCopperCrate(player.inventory, (TileEntityMannCoCopperCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if(ID == Reference.GUI_STEEL_CRATE) return new ContainerMannCoSteelCrate(player.inventory, (TileEntityMannCoSteelCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if(ID == Reference.GUI_EMARALD_CRATE) return new ContainerMannCoEmaraldCrate(player.inventory, (TileEntityMannCoEmaraldCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_COPPER_CRATE) return new GuiMannCoCopperCrate(player.inventory, (TileEntityMannCoCopperCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if (ID == Reference.GUI_STEEL_CRATE) return new GuiMannCoSteelCrate(player.inventory, (TileEntityMannCoSteelCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		
		if(ID == Reference.GUI_EMARALD_CRATE) return new GuiMannCoEmaraldCrate(player.inventory, (TileEntityMannCoEmaraldCrate)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}

}

