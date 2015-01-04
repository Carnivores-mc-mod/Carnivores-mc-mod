package com.caske2000.carnivores.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.caske2000.carnivores.blocks.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final CarnivoresItem ammo = new ItemPistolAmmo();
	public static final CarnivoresItem pistol = new ItemPistol();
	public static final CarnivoresItem ammo2 = new ItemRifleAmmo();
	public static final CarnivoresItem rifle = new ItemRifle();
	public static final CarnivoresItem xbow = new ItemXBow();
	public static final CarnivoresItem ammo3 = new ItemXBowAmmo();
	public static final Item mudBucket = new ItemMudBucket(ModBlocks.mudFluidBlock, "mudBucket").setUnlocalizedName("mudBucket").setContainerItem(
			Items.bucket);

	public static void init() {

		GameRegistry.registerItem(ammo, "ammo");
		GameRegistry.registerItem(ammo2, "ammo2");
		GameRegistry.registerItem(pistol, "pistol");
		GameRegistry.registerItem(rifle, "rifle");
		GameRegistry.registerItem(mudBucket, "bucketofmud");
		GameRegistry.registerItem(xbow, "xbow");
		GameRegistry.registerItem(ammo3, "ammo3");
	}

}
