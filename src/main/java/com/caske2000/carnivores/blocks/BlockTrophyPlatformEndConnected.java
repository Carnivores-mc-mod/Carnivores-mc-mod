package com.caske2000.carnivores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.reference.Reference;

public class BlockTrophyPlatformEndConnected extends Block {
	static String name = "trophyPlatformEndConnected";
	private IIcon[] icons = new IIcon[6];

	protected BlockTrophyPlatformEndConnected() {
		super(Material.ground);
		this.setBlockName(Reference.MODID + "_" + name);
		this.setCreativeTab(Carnivores.carnivoresTab);
		this.setStepSound(soundTypeMetal);
		this.setBlockTextureName(name);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			if (i == 1) {
				icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name);
				continue;
			}
			icons[i] = iconRegister.registerIcon(Reference.MODID + ":trophyTileBase");
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.trophyPlatformEndConnected);
	}
}
