package com.tristanbomb.chemical_expansion.block;
import java.util.List;

import com.tristanbomb.chemical_expansion.ChemicalExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BlockBase extends Block {

	protected String name;
	
	protected String oreName;

	public BlockBase(String name, Material material) {
		super(material);

		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(ChemicalExpansion.creativeTab);
	}
	
	public BlockBase(String name, Material material, String oreName) {
		this(name, material);
		this.oreName = oreName;
	}
	
	public void registerItemModel(ItemBlock itemBlock) {
		ChemicalExpansion.proxy.registerItemRenderer(itemBlock, 0, name);
	}

}