package com.craftediidev.c2.init;

import com.craftediidev.c2.Main;
import com.craftediidev.c2.entity.EntityMikey;
import com.craftediidev.c2.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{

	public static void registerEntities()
	{
		registerEntity("mikey", EntityMikey.class, Reference.ENTITY_MIKEY, 50, 13635694, 13678812);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
