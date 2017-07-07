package com.tristanbomb.chemical_expansion.block;

import com.tristanbomb.chemical_expansion.tileentity.TileEntityGrinder;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockGrinder extends BlockMachine implements ITileEntityProvider {

	public BlockGrinder(String name) {
		super(name);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityGrinder();
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos,
			IBlockState state, EntityPlayer playerIn, EnumHand hand,
			ItemStack heldItem, EnumFacing side, float hitX, float hitY,
			float hitZ) {
		
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		
		if(tileEntity instanceof TileEntityGrinder) {
			if (!worldIn.isRemote) {
				if (heldItem != null) {
					heldItem = ((TileEntityGrinder) tileEntity).grindItem(heldItem);
				}
			}
		}
		
		return true;
	}
}
