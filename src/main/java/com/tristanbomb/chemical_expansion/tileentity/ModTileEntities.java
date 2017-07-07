package com.tristanbomb.chemical_expansion.tileentity;

import com.tristanbomb.chemical_expansion.ChemicalExpansion;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	public static void init(){
		GameRegistry.registerTileEntity(TileEntityGrinder.class, ChemicalExpansion.modId + ".TileEntityGrinder");
	}
}
