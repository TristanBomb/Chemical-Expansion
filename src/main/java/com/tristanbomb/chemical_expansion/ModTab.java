package com.tristanbomb.chemical_expansion;

import com.tristanbomb.chemical_expansion.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTab extends CreativeTabs {

	public ModTab() {
		super(ChemicalExpansion.modId);
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCombined;
	}

}
