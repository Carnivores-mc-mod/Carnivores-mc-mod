package com.caske2000.carnivores.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class EntityXBowBolt extends EntityThrowable {

	private int lifeTime = 400;
	private double speed = 2.01;
	private final int damage = 8;

	public EntityXBowBolt(World world) {

		super(world);
		setSize(0.5F, 0.5F);

	}

	public EntityXBowBolt(World world, EntityLivingBase entity) {

		super(world, entity);

	}

	public EntityXBowBolt(World world, double var2, double var3, double var4) {

		super(world, var2, var3, var4);

	}

	@Override
	protected void onImpact(MovingObjectPosition movObjPos) {

		if (movObjPos.typeOfHit == MovingObjectType.ENTITY) {

			movObjPos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);

		} else if (movObjPos.typeOfHit == MovingObjectType.BLOCK) {

		}

		this.setDead();

	}

	/*
	 * @Override protected float getGravityVelocity() {
	 * 
	 * this.motionX *= speed; this.motionY *= speed; this.motionZ *= speed;
	 * return 0;
	 * 
	 * }
	 */

	public int getMaxLifetime() {
		return 400;
	}

	public float getAirResistance() {
		return 0.0F;
	}

	public float getGravity() {
		return 0.0F;
	}

	public int getMaxArrowShake() {
		return 0;
	}

}
