package com.tristanbomb.chemical_expansion.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockMetal extends BlockBase {
	
	public BlockMetal(String name) {
		super(name, Material.IRON, name);
		System.out.println(name);
		
		setHardness(5f);
		setResistance(30f);
	}
	
}
