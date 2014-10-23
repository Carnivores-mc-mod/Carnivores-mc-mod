package com.caske2000.carnivores.handler;

import java.util.HashMap;
import java.util.Map;

import com.caske2000.carnivores.blocks.ModBlocks;
import com.caske2000.carnivores.items.ModItems;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class BucketHandler 
{
	
	@SubscribeEvent
	 public void onBucketFill (FillBucketEvent event) {
	 ItemStack result = fillBucket (event.world, event.target);
	 
	 if (result == null) {
	 return;
	 }
	 
	 event.result = result;
	 event.setResult (Result.ALLOW);
	 }
	 
	 public ItemStack fillBucket (World world, MovingObjectPosition position) {
	 Block block = world.getBlock (position.blockX, position.blockY, position.blockZ);
	 int metadata = world.getBlockMetadata (position.blockX, position.blockY, position.blockZ);
	 
	 if (block.equals (ModBlocks.mudFluidBlock) && metadata == 0) {
	 world.setBlock (position.blockX, position.blockY, position.blockZ, Blocks.air);
	 return new ItemStack (ModItems.mudBucket);
	 } else {
	 return null;
	 }
	 }
}
	