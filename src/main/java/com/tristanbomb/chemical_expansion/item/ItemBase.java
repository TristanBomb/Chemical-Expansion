package com.tristanbomb.chemical_expansion.item;

import java.util.List;

import com.tristanbomb.chemical_expansion.ChemicalExpansion;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item {
	
	protected String name;
	
	protected String oreName;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(ChemicalExpansion.creativeTab);
	}
	
	public ItemBase(String name, String oreName) {
		this(name);
		this.oreName = oreName;
	}

	public void registerItemModel() {
		ChemicalExpansion.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
		if(this.name == "dustNetherStar") {
				return true;
		}
		else return false;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
		switch(this.name) {
		}
		tooltip.add("§8Chemical Expansion");
    }
	
}
