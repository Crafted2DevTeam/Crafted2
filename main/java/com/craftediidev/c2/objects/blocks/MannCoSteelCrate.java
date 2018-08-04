package com.craftediidev.c2.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class MannCoSteelCrate extends BlockBase
{

	public MannCoSteelCrate(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state) 
    {
        return false;
    }
	
}