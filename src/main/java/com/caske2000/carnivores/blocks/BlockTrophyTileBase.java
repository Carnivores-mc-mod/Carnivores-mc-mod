package com.caske2000.carnivores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.reference.Reference;

public class BlockTrophyTileBase extends Block {
	static String name = "trophyTileBase";
	private IIcon[] icons = new IIcon[6];

	protected BlockTrophyTileBase() {
		super(Material.iron);
		this.setBlockName(Reference.MODID + "_" + name);
		this.setCreativeTab(Carnivores.carnivoresTab);
		this.setStepSound(soundTypeMetal);
		this.setBlockTextureName(Reference.MODID + ":" + name);
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.trophyTileBase);
	}
}
