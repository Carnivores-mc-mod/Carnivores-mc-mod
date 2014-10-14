package com.caske2000.carnivores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.caske2000.carnivores.items.ModItems;
import com.caske2000.carnivores.reference.Reference;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEgg;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEggOpen;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block unknownBox;
	public static Block unknownEgg;
	public static Block unknownEggOpen;
	public static Fluid mudFluid;
	public static Block mudFluidBlock;

public static void init(){
	unknownBox = new UnknownBox();
	unknownEgg = new BlockUnknownEgg(Material.wood).setBlockName("UnknownEgg").setBlockTextureName(Reference.MODID + ":" + "unknownEggParticles");
	unknownEggOpen = new BlockUnknownEggOpen(Material.wood).setBlockName("UnknownEggOpen").setBlockTextureName(Reference.MODID + ":" + "unknownEggParticles");
	mudFluid = new Fluid("mud").setUnlocalizedName("mud").setLuminosity(0).setDensity(1000).setTemperature(295).setViscosity(3500).setGaseous(false);
	GameRegistry.registerBlock(unknownEgg, "unknownEgg");
	GameRegistry.registerBlock(unknownEggOpen, "unknownEggOpen");
	GameRegistry.registerTileEntity(TileEntityUnknownEgg.class, "");
	GameRegistry.registerTileEntity(TileEntityUnknownEggOpen.class, "2");
	FluidRegistry.registerFluid(mudFluid);
	mudFluidBlock = new BlockMud(mudFluid, Material.water).setBlockName("mud");
	GameRegistry.registerBlock(mudFluidBlock, "mud");
	
}
}
