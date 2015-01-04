package com.caske2000.carnivores.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.caske2000.carnivores.entity.EntitySuchomimus;
import com.caske2000.carnivores.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntitySuchomimus extends RenderLiving {

	private static final ResourceLocation suchoTextures = new ResourceLocation(Reference.MODID + ":textures/entity/suchomimus.png");
	private static final String __OBFID = "CL_00000984";

	public RenderEntitySuchomimus(ModelBase modelBase, float var2) {

		super(modelBase, var2);

	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntitySuchomimus sucho) {

		return suchoTextures;

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return this.getEntityTexture((EntitySuchomimus) entity);
	}
}