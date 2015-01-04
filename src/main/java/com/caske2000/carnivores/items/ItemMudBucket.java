package com.caske2000.carnivores.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.world.World;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.blocks.ModBlocks;
import com.caske2000.carnivores.reference.Reference;

public class ItemMudBucket extends ItemBucket {

	protected ItemMudBucket(Block block, String fluidName) {
		super(block);
		setCreativeTab(Carnivores.carnivoresTab);
		setContainerItem(Items.bucket);
		setUnlocalizedName("bucket_mud");
		setTextureName(Reference.MODID + ":" + "bucket_mud");
		fluidName = "mud";
	}

	public Block isFull;

	@Override
	public boolean tryPlaceContainedLiquid(World world, int x, int y, int z) {
		Material material = world.getBlock(x, y, z).getMaterial();
		boolean flag = !material.isSolid();

		if (this.isFull == Blocks.air) {
			return false;
		} else if (!world.isAirBlock(x, y, z) && !flag) {
			return false;
		}

		else {
			world.setBlock(x, y, z, ModBlocks.mudFluidBlock, 0, 3);
			return true;
		}

	}

}