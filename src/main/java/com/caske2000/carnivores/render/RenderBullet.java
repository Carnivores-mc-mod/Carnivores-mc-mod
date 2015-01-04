package com.caske2000.carnivores.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.caske2000.carnivores.entity.EntityBullet;
import com.caske2000.carnivores.model.ModelBullet;
import com.caske2000.carnivores.reference.Reference;

public class RenderBullet extends Render {

	private static final ResourceLocation bulletEntity = new ResourceLocation(Reference.MODID + ":" + "textures/entity/bullet.png");

	private ModelBase model;

	public RenderBullet() {

		super();
		shadowSize = 0.5F;
		model = new ModelBullet();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {

		GL11.glPushMatrix();
		this.bindTexture(bulletEntity);
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		Tessellator tessellator = Tessellator.instance;
		float f2 = 0.0F;
		float f3 = 0.3125F;
		float f10 = 0.05625F;
		GL11.glEnable(32826);
		GL11.glScalef(0.0625F, 0.0625F, 0.0625F);
		GL11.glNormal3f(f10, 0.0F, 0.0F);
		GL11.glNormal3f(-f10, 0.0F, 0.0F);
		for (int j = 0; j < 4; j++) {
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glNormal3f(0.0F, 0.0F, f10);
		}
		GL11.glDisable(32826);
		GL11.glPopMatrix();

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// this method should return your texture, which may be different based
		// on certain characteristics of your custom entity; if that is the
		// case,
		// you may want to make a second method that takes your class:
		return getCustomTexture((EntityBullet) entity);
	}

	protected ResourceLocation getCustomTexture(EntityBullet entity) {

		return bulletEntity;

	}
}
