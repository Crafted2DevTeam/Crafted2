package com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate;

import com.craftediidev.c2.util.Reference;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.ContainerMannCoCopperCrate;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.TileEntityMannCoCopperCrate;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMannCoEmaraldCrate extends GuiContainer
{
	private static final ResourceLocation GUI_CHEST = new ResourceLocation(Reference.MOD_ID + ":textures/gui/mann_co_emarlad_crate.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityMannCoEmaraldCrate te;
	
	public GuiMannCoEmaraldCrate(InventoryPlayer playerInventory, TileEntityMannCoEmaraldCrate chestInventory, EntityPlayer player) 
	{
		super(new ContainerMannCoEmaraldCrate(playerInventory, chestInventory, player));
		this.playerInventory = playerInventory;
		this.te = chestInventory;
		
		this.xSize = 179;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 16086784);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 16086784);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_CHEST);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}