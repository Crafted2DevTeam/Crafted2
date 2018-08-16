package com.craftediidev.c2.objects.blocks.crates.MannCoEmaraldCrate;

import com.craftediidev.c2.util.Reference;
import com.craftediidev.c2.objects.blocks.crates.MannCoCopperCrate.ContainerMannCoCopperCrate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityMannCoEmaraldCrate extends TileEntityLockableLoot implements ITickable
{
	private NonNullList<ItemStack> chestContents = NonNullList.<ItemStack>withSize(72, ItemStack.EMPTY);
	public int numPlayersUsing, ticksSinceSync;
 	
	@Override
	public int getSizeInventory()
	{
		return 72;
	}
	
	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}
	
	@Override
	public boolean isEmpty()
	{
		for(ItemStack stack : this.chestContents)
		{
			if(!stack.isEmpty()) return false;
		}
		
		return true;
	}
	
	@Override
	public String getName() 
	{
		return this.hasCustomName() ? this.customName : "Mann Co Emarald Crate";
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.chestContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		
		if(!this.checkLootAndRead(compound)) ItemStackHelper.loadAllItems(compound, chestContents);
		if(compound.hasKey("CustomName", 8)) this.customName = compound.getString("CustomName");
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		if(!this.checkLootAndWrite(compound)) ItemStackHelper.saveAllItems(compound, chestContents);
		if(compound.hasKey("CustomName", 8)) compound.setString("CustomName", this.customName);
		
		return compound;
	}
	
	@Override
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) 
	{
		return new ContainerMannCoEmaraldCrate(playerInventory, this, playerIn);
	}
	
	@Override
	public String getGuiID() 
	{
		return Reference.MOD_ID + ":emarlad_crate";
	}
	
	@Override
	protected NonNullList<ItemStack> getItems() 
	{
		return this.chestContents;
	}
	
	@Override
	public void update()
	{
		if (!this.world.isRemote && this.numPlayersUsing != 0 && (this.ticksSinceSync + pos.getX() + pos.getY() + pos.getZ()) % 200 == 0)
        {
            this.numPlayersUsing = 0;
            float f = 5.0F;

            for (EntityPlayer entityplayer : this.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB((double)((float)pos.getX() - 5.0F), (double)((float)pos.getY() - 5.0F), (double)((float)pos.getZ() - 5.0F), (double)((float)(pos.getX() + 1) + 5.0F), (double)((float)(pos.getY() + 1) + 5.0F), (double)((float)(pos.getZ() + 1) + 5.0F))))
            {
                if (entityplayer.openContainer instanceof ContainerMannCoCopperCrate)
                {
                    if (((ContainerMannCoEmaraldCrate)entityplayer.openContainer).getChestInventory() == this)
                    {
                        ++this.numPlayersUsing;
                    }
                }
            }
        }
		
         		
	}
	
	@Override
	public void openInventory(EntityPlayer player)
	{
		++this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}
	
	@Override
	public void closeInventory(EntityPlayer player) 
	{
		--this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}	
}