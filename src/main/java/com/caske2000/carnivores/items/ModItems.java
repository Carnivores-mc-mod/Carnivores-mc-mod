package com.caske2000.carnivores.items;

import com.caske2000.carnivores.blocks.ModBlocks;
import com.caske2000.carnivores.handler.BucketHandler;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final CarnivoresItem ammo = new ItemPistolAmmo();
	public static final CarnivoresItem pistol = new ItemPistol();
	public static final CarnivoresItem ammo2 = new ItemRifleAmmo();
	public static final CarnivoresItem rifle = new ItemRifle();
	public static final Item mudBucket = new ItemMudBucket(ModBlocks.mudFluidBlock, "mudBucket").setUnlocalizedName("mudBucket").setContainerItem(Items.bucket);
	public static void init() {

		GameRegistry.registerItem(ammo, "ammo");
		GameRegistry.registerItem(ammo2, "ammo2");
		GameRegistry.registerItem(pistol, "pistol");		
		GameRegistry.registerItem(rifle, "rifle");
		GameRegistry.registerItem(mudBucket, "bucketofmud");
		
	}

}
