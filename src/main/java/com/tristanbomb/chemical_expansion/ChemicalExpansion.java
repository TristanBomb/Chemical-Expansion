package com.tristanbomb.chemical_expansion;

import com.tristanbomb.chemical_expansion.block.ModBlocks;
import com.tristanbomb.chemical_expansion.item.ModItems;
import com.tristanbomb.chemical_expansion.proxy.*;
import com.tristanbomb.chemical_expansion.recipe.ModRecipes;
import com.tristanbomb.chemical_expansion.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ChemicalExpansion.modId, name = ChemicalExpansion.name, version = ChemicalExpansion.version, acceptedMinecraftVersions = "[1.10.2]")

public class ChemicalExpansion {

	public static final String modId = "chemical_expansion";
	public static final String name = "Chemical Expansion";
	public static final String version = "0.0.1";
	
	public static final ModTab creativeTab = new ModTab();
	
	@Mod.Instance(modId)
	public static ChemicalExpansion instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " has entered pre-init! Item and block registry goes here.");
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 5);
	}
	
	@Mod.EventHandler
	public void midInit(FMLInitializationEvent event) {
		System.out.println(name + " has entered mid-init! Recipe and oredict registry goes here.");
		ModRecipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(name + " has entered post-init! Cross-mod compatiblity goes here.");
	}
	
	@SidedProxy(serverSide = "com.tristanbomb.chemical_expansion.proxy.CommonProxy", clientSide = "com.tristanbomb.chemical_expansion.proxy.ClientProxy")
	public static CommonProxy proxy;

}
