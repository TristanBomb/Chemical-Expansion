package com.tristanbomb.chemical_expansion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	
	public static ItemBase ingotCopper;
	public static ItemBase ingotLead;
	public static ItemBase ingotSilver;
	public static ItemBase ingotCombined;
	public static ItemBase dustNetherStar;
	
	public static void init() {
		ingotCopper		= register(new ItemBase("ingotCopper", "ingotCopper"));
		ingotLead		= register(new ItemBase("ingotLead", "ingotLead"));
		ingotSilver		= register(new ItemBase("ingotSilver", "ingotSilver"));
		ingotCombined	= register(new ItemBase("ingotCombined"));
		dustNetherStar	= register(new ItemBase("dustNetherStar", "dustNetherStar"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
			if (((ItemBase)item).oreName != null) {
				OreDictionary.registerOre(((ItemBase)item).oreName, item);
			}
		}

		return item;
	}

}
