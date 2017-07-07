package com.tristanbomb.chemical_expansion.recipe;

import com.tristanbomb.chemical_expansion.block.ModBlocks;
import com.tristanbomb.chemical_expansion.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {

	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dustNetherStar, 8), "DDD", "DSD", "DDD", 'D', "dustGlowstone", 'S', Items.NETHER_STAR));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotSoldering), "ingotLead", "ingotLead", "ingotSilver", "dustRedstone"));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCopper, "III", "III", "III", 'I', "ingotCopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockLead, "III", "III", "III", 'I', "ingotLead"));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockSilver, "III", "III", "III", 'I', "ingotSilver"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotCopper, 9), "blockCopper"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotLead, 9), "blockLead"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotSilver, 9), "blockSilver"));
		
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreLead, new ItemStack(ModItems.ingotLead), 0.7f);
		GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver), 0.7f);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineFrameIron, "MNM", "NCN", "MNM", 'M', ModItems.ingotSoldering, 'N', "dustRedstone", 'C', "blockIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineFrameGold, "MNM", "NCN", "MNM", 'M', "ingotGold", 'N', "gemQuartz", 'C', ModBlocks.machineFrameIron));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineFrameDiamond, "MNM", "NCN", "MNM", 'M', "gemDiamond", 'N', "gemPrismarine", 'C', ModBlocks.machineFrameGold));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineFrameMax, "MNM", "NCN", "MNM", 'M', Blocks.PURPUR_BLOCK, 'N', "dustNetherStar", 'C', ModBlocks.machineFrameDiamond));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineGrinder, "FHF", "PMP", "LRL", 'M', ModBlocks.machineFrameIron, 'F', Items.FLINT, 'H', Blocks.HOPPER, 'P', Blocks.PISTON, 'L', "ingotLead", 'R', "dustRedstone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineHeater, "BLB", "FMF", "CRC", 'M', ModBlocks.machineFrameIron, 'B', "ignotBrick", 'L', Items.FLINT_AND_STEEL, 'F', Blocks.FURNACE, 'C', "ingotCopper", 'R', Items.REDSTONE));
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.machineMixer, "BSB", "GMG", "ARA", 'M', ModBlocks.machineFrameIron, 'S', "stick", 'G', Blocks.GLASS, 'B', Items.BUCKET, 'A', "ingotSilver", 'R', Items.REDSTONE));
		
		/*GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.basicBattery), "CEC", "EME", "CEC", 'C', "ingotLead", 'E', "dustSulfur", 'M', "blockRedstone");
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.basicPipe), "MMM", "NNN", "MMM", 'M', "ingotLead", 'N', "blockGlass");
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.basicTube), "MMM", "NNN", "MMM", 'M', "ingotSilver", 'N', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.basicWire), "MMM", "NNN", "MMM", 'M', "ingotCopper", 'N', "dustRedstone");*/

	}
	
}
