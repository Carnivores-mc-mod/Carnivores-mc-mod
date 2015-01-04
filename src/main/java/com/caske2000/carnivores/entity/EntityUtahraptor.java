package com.caske2000.carnivores.entity;

import net.minecraft.world.World;

import com.caske2000.carnivores.reference.Reference;

public class EntityUtahraptor extends EntityCarnivoresMob {

	public EntityUtahraptor(World world) {

		super(world);
		this.setSize(2.7F, 2.0F);

	}

	@Override
	protected String getHurtSound() {
		return Reference.MODID + ":" + "mobs.utahraptor.hurt";
	}

	@Override
	protected String getDeathSound() {
		return Reference.MODID + ":" + "mobs.utahraptor.die";
	}
}
