package com.caske2000.carnivores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTrophyCorner extends BlockSlab {

	static String name = "trophyCorner";
	private Block extendingBlock;
	@SideOnly(Side.CLIENT)
	private IIcon sideIcon;

	public BlockTrophyCorner(boolean doubleSlab, Block block) {
		super(doubleSlab, Material.rock);
		// setBlockTextureName(Reference.MODID + ":" + name);

		if (!doubleSlab) {
			this.setBlockName(Reference.MODID + "_" + name);
			// setBlockTextureName(Reference.MODID + ":" + name);
			setCreativeTab(Carnivores.carnivoresTab);
			setLightOpacity(0);
		}
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(World wrld, int x, int y, int z) {
		return Item.getItemFromBlock(ModBlocks.trophyCorner);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
		blockIcon = register.registerIcon(Reference.MODID + ":" + name);
		sideIcon = register.registerIcon(Reference.MODID + ":trophyCornerSide");

	}

	public String func_150002_b(int var1) {
		return super.getUnlocalizedName();
	}

}
