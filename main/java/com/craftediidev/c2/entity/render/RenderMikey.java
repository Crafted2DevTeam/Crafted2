package com.craftediidev.c2.entity.render;

import com.craftediidev.c2.entity.EntityMikey;
import com.craftediidev.c2.entity.model.ModelMikey;
import com.craftediidev.c2.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMikey extends RenderLiving<EntityMikey>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/mikey.png");
	
	public RenderMikey(RenderManager manager) 
	{
		super(manager, new ModelMikey(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMikey entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityMikey entityLiving, float p_77043_2_, float rotationYaw, float particleTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, particleTicks);
	}
	
}
