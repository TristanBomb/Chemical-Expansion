package com.tristanbomb.chemical_expansion.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockBase extends ItemBlock {

	public ItemBlockBase(Block block)
	{
        super(block);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
		switch(this.getUnlocalizedName()) {
			case "tile.oreCopper": tooltip.add("Copper Ore"); break;
			case "tile.oreLead": tooltip.add("Lead Ore"); break;
			case "tile.oreSilver": tooltip.add("Silver Ore"); break;
			case "tile.machineFrameIron": tooltip.add("Tier I - Iron"); break;
			case "tile.machineFrameGold": tooltip.add("§6Tier II - Gold"); break;
			case "tile.machineFrameDiamond": tooltip.add("§3Tier III - Diamond"); break;
			case "tile.machineFrameMax": tooltip.add("§5Tier IV - Stellar"); break;
		}
    }
}
