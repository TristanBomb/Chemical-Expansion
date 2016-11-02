package com.tristanbomb.chemical_expansion.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase {
	
	public BlockOre(String name) {
		super(name, Material.ROCK, name);
		
		setHardness(3f);
		setResistance(15f);
	}
	
}
