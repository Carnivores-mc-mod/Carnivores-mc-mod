package com.caske2000.carnivores.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.entity.EntityXBowBolt;
import com.caske2000.carnivores.reference.Reference;

public class ItemXBow extends CarnivoresItem {

	public ItemXBow() {

		super();
		setCreativeTab(Carnivores.carnivoresTab);
		setUnlocalizedName("xbow");
		this.maxStackSize = 1;

	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ModItems.ammo3)) {

			world.playSoundAtEntity(player, Reference.MODID + ":" + "x_bow_sound_1", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

			if (!world.isRemote) {

				world.spawnEntityInWorld(new EntityXBowBolt(world, player));

			}

		}
		return itemStack;

	}

}
