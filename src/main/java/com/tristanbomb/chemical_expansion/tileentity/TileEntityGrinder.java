package com.tristanbomb.chemical_expansion.tileentity;

import com.tristanbomb.chemical_expansion.block.ModBlocks;
import com.tristanbomb.chemical_expansion.item.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGrinder extends TileEntity {

	public ItemStack grindItem(ItemStack stack) {
		
		if(true) {
		//if(stack.getItem() == Item.getByNameOrId("chemical_expansion:oreCopper")) {
			System.out.println(stack.getItem());
			System.out.println(Item.getByNameOrId("chemical_expansion:oreCopper"));
			world.spawnEntity(new EntityItem(world, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, new ItemStack(ModItems.ingotCopper)));
			stack.stackSize--;
			if(stack.stackSize < 1){stack = null;}
		}
		return stack;
		
	}
}
