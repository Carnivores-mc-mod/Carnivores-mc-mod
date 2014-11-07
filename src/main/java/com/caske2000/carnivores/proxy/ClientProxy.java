package com.caske2000.carnivores.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.caske2000.carnivores.blocks.ModBlocks;
import com.caske2000.carnivores.entity.EntityBullet;
import com.caske2000.carnivores.entity.EntityCeratosaurus;
import com.caske2000.carnivores.entity.EntitySuchomimus;
import com.caske2000.carnivores.entity.EntityUtahraptor;
import com.caske2000.carnivores.model.ModelBullet;
import com.caske2000.carnivores.model.ModelCeratosaurus;
import com.caske2000.carnivores.model.ModelSuchomimus;
import com.caske2000.carnivores.model.ModelUtahraptor;
import com.caske2000.carnivores.render.ItemRendererUnknownEgg;
import com.caske2000.carnivores.render.ItemRendererUnknownEggOpen;
import com.caske2000.carnivores.render.RenderEntityCeratosaurus;
import com.caske2000.carnivores.render.RenderEntitySuchomimus;
import com.caske2000.carnivores.render.RenderEntityUtahraptor;
import com.caske2000.carnivores.render.RenderBullet;
import com.caske2000.carnivores.render.RenderUnknownEgg;
import com.caske2000.carnivores.render.RenderUnknownEggOpen;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEgg;
import com.caske2000.carnivores.tileentities.TileEntityUnknownEggOpen;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderers() {

		super.registerRenderers();

		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		RenderingRegistry.registerEntityRenderingHandler(EntityUtahraptor.class, new RenderEntityUtahraptor(new ModelUtahraptor(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityCeratosaurus.class, new RenderEntityCeratosaurus(new ModelCeratosaurus(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySuchomimus.class, new RenderEntitySuchomimus(new ModelSuchomimus(), 0));
		TileEntitySpecialRenderer render = new RenderUnknownEgg();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityUnknownEgg.class, render);
		TileEntitySpecialRenderer render2 = new RenderUnknownEggOpen();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityUnknownEggOpen.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.unknownEgg), new ItemRendererUnknownEgg(render, new TileEntityUnknownEgg()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.unknownEggOpen), new ItemRendererUnknownEggOpen(render2, new TileEntityUnknownEggOpen()));
	}

	public void registerTileEntitySpecialRenderer(){
		
	}
	
}