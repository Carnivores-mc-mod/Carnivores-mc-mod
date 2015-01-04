package com.caske2000.carnivores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class UnknownBox extends Block {
	static String name = "unknownBox";
	private IIcon[] icons = new IIcon[6];

	protected UnknownBox() {
		super(Material.iron);
		this.setBlockName(Reference.MODID + "_" + name);
		this.setCreativeTab(Carnivores.carnivoresTab);
		GameRegistry.registerBlock(this, name);
		this.setStepSound(soundTypeMetal);

	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return Item.getItemFromBlock(ModBlocks.unknownBox);
	}
}
