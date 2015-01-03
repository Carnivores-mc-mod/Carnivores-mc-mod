package com.caske2000.carnivores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.reference.Reference;

public class BlockCrate extends Block {

	static String name = "crate";
	private IIcon[] icons = new IIcon[6];
		protected BlockCrate() 
		{
			super(Material.iron);
			this.setBlockName(Reference.MODID + "_" + name);
			this.setCreativeTab(Carnivores.carnivoresTab);
			this.setStepSound(soundTypeMetal);
		}

		@Override
		public void registerBlockIcons(IIconRegister iconRegister) 
		{
		    for (int i = 0; i < icons.length; i++) 
		    {
		        icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
		    }
		}
		@Override
		public IIcon getIcon(int side, int meta) 
		{
		    return icons[side];
		}
		
		@Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(ModBlocks.crate);
        }
		
}
