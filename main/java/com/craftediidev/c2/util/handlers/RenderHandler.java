package com.craftediidev.c2.util.handlers;

import com.craftediidev.c2.entity.EntityMikey;
import com.craftediidev.c2.entity.render.RenderMikey;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void RegisterEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMikey.class, new IRenderFactory<EntityMikey>()
		{
			@Override
			public Render<? super EntityMikey> createRenderFor(RenderManager manager)
			{
				return new RenderMikey(manager);
			}
		});
	}
}
