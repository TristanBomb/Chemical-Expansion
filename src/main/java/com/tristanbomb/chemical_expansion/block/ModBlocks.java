package com.tristanbomb.chemical_expansion.block;

import net.minecraft.creativetab.CreativeTabs;

import com.tristanbomb.chemical_expansion.item.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	
	public static BlockOre oreCopper;
	public static BlockOre oreLead;
	public static BlockOre oreSilver;
	public static BlockMetal blockCopper;
	public static BlockMetal blockLead;
	public static BlockMetal blockSilver;
	public static BlockGrinder machineGrinder;
	public static BlockMachine machineHeater;
	public static BlockMachine machineMixer;
	public static BlockTransparent machineFrameIron;
	public static BlockTransparent machineFrameGold;
	public static BlockTransparent machineFrameDiamond;
	public static BlockTransparent machineFrameMax;
	
	public static void init() {
		oreCopper	= register(new BlockOre("oreCopper"));
		oreLead		= register(new BlockOre("oreLead"));
		oreSilver	= register(new BlockOre("oreSilver"));
		blockCopper	= register(new BlockMetal("blockCopper"));
		blockLead	= register(new BlockMetal("blockLead"));
		blockSilver	= register(new BlockMetal("blockSilver"));
		machineGrinder		= register(new BlockGrinder("machineGrinder"));
		machineHeater		= register(new BlockMachine("machineHeater"));
		machineMixer		= register(new BlockMachine("machineMixer"));
		machineFrameIron	= register(new BlockTransparent("machineFrameIron"));
		machineFrameGold	= register(new BlockTransparent("machineFrameGold"));
		machineFrameDiamond	= register(new BlockTransparent("machineFrameDiamond"));
		machineFrameMax		= register(new BlockTransparent("machineFrameMax"));
	}
	
	private static <T extends Block> T register(T block, ItemBlockBase itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
			if (((BlockBase)block).oreName != null) {
				OreDictionary.registerOre(((BlockBase)block).oreName, block);
			}
		}

		return block;
	}
	
	private static <T extends Block> T register(T block) {		
		ItemBlockBase itemBlock = new ItemBlockBase(block);
		itemBlock.setRegistryName(block.getRegistryName());

		return register(block, itemBlock);
	}

}
