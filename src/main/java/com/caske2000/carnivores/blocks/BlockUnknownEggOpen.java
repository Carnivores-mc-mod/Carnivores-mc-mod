package com.caske2000.carnivores.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEggOpen;

public class BlockUnknownEggOpen extends BlockContainer {

	protected BlockUnknownEggOpen(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setCreativeTab(Carnivores.carnivoresTab);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityUnknownEggOpen();
	}

}
