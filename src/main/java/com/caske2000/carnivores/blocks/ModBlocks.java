package com.caske2000.carnivores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.caske2000.carnivores.fluids.FluidMud;
import com.caske2000.carnivores.reference.Reference;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEgg;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEggOpen;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block unknownBox;
	public static Block unknownEgg;
	public static Block unknownEggOpen;
	public static Fluid mudFluid;
	public static Block mudFluidBlock;
	public static Block crate;
	public static Block trophyDrain;
	public static Block trophyPlatformEnd;
	public static Block trophyPlatformEndConnected;
	public static Block trophyTileBase;

	public static void init() {

		// Blocks
		unknownBox = new UnknownBox().setHardness(5.0F).setResistance(30.0F);
		unknownEgg = new BlockUnknownEgg(Material.wood).setBlockName("UnknownEgg").setBlockTextureName(Reference.MODID + ":" + "unknownEggParticles");
		unknownEggOpen = new BlockUnknownEggOpen(Material.wood).setBlockName("UnknownEggOpen").setBlockTextureName(Reference.MODID + ":" + "unknownEggParticles");
		crate = new BlockCrate();
		trophyDrain = new BlockTrophyDrain();
		trophyPlatformEnd = new BlockTrophyPlatformEnd();
		trophyPlatformEndConnected = new BlockTrophyPlatformEndConnected();
		trophyTileBase = new BlockTrophyTileBase();

		GameRegistry.registerBlock(unknownEgg, "unknownEgg");
		GameRegistry.registerBlock(unknownEggOpen, "unknownEggOpen");
		GameRegistry.registerBlock(crate, "crate");
		GameRegistry.registerBlock(trophyDrain, "trophyDrain");
		GameRegistry.registerBlock(trophyPlatformEnd, "trophyPlatformEnd");
		GameRegistry.registerBlock(trophyPlatformEndConnected, "trophyPlatformEndConnected");
		GameRegistry.registerBlock(trophyTileBase, "trophyTileBase");

		// Fluids
		mudFluid = new FluidMud();
		FluidRegistry.registerFluid(mudFluid);
		mudFluidBlock = new BlockMud(mudFluid, Material.water).setBlockName("mud");
		GameRegistry.registerBlock(mudFluidBlock, "mud");

		// Tile Entities
		GameRegistry.registerTileEntity(TileEntityUnknownEgg.class, "");
		GameRegistry.registerTileEntity(TileEntityUnknownEggOpen.class, "2");

	}
}
