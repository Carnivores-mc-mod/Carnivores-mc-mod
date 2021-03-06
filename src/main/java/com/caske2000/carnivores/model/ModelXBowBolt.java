package com.caske2000.carnivores.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXBowBolt extends ModelBase {
	// fields
	ModelRenderer bolt;

	public ModelXBowBolt() {
		textureWidth = 64;
		textureHeight = 32;

		bolt = new ModelRenderer(this, 0, 0);
		bolt.addBox(0F, 0F, 0F, 1, 1, 16);
		bolt.setRotationPoint(0F, 0F, 0F);
		bolt.setTextureSize(64, 32);
		bolt.mirror = true;
		setRotation(bolt, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bolt.render(f5);
	}

	public void renderModel(float f) {
		bolt.render(f);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
