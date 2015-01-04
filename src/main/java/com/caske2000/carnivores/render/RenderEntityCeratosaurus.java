package com.caske2000.carnivores.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.caske2000.carnivores.entity.EntityCeratosaurus;
import com.caske2000.carnivores.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityCeratosaurus extends RenderLiving {

	private static final ResourceLocation ceratoTextures = new ResourceLocation(Reference.MODID + ":" + "textures/entity/ceratosaurus.png");
	private static final String __OBFID = "CL_00000984";

	public RenderEntityCeratosaurus(ModelBase modelBase, float var2) {

		super(modelBase, var2);

	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityCeratosaurus cerato) {

		return ceratoTextures;

	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return this.getEntityTexture((EntityCeratosaurus) entity);
	}

}