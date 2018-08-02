package com.craftediidev.c2;

import com.craftediidev.c2.Main;
import com.craftediidev.c2.proxy.CommonProxy;
import com.craftediidev.c2.tabs.CraftedTab;
import com.craftediidev.c2.util.Reference;
import com.craftediidev.c2.init.ModRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs craftedtab = new CraftedTab("craftedtab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
	}
}