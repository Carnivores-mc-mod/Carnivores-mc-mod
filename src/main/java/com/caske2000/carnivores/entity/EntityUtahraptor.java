package com.caske2000.carnivores.entity;

import com.caske2000.carnivores.reference.Reference;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityUtahraptor extends EntityCarnivoresMob {

	public EntityUtahraptor(World world) {

		super(world);
		this.setSize(2.7F, 2.0F);
		
	}
	
	protected String getHurtSound()
	{
		return Reference.MODID + ":" + "mobs.utahraptor.hurt";
	}
	
	protected String getDeathSound()
	{
		return Reference.MODID + ":" + "mobs.utahraptor.die";
	}
}
