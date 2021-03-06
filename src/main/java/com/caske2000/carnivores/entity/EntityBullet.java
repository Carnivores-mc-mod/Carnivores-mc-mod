package com.caske2000.carnivores.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable {

	private int lifeTime = 100;
	private double speed = 1.501;
	private int damage;

	public EntityBullet(World world) {

		super(world);
		setSize(0.5F, 0.5F);

	}

	public EntityBullet(World world, EntityLivingBase entity) {

		super(world, entity);

	}

	public EntityBullet(World world, double var2, double var3, double var4) {

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
		return 200;
	}

	public float getAirResistance() {
		return 0.98F;
	}

	public float getGravity() {
		return getGravityVelocity();
	}

	@Override
	protected float getGravityVelocity() {
		return 0.00F;
	}

	public int getMaxArrowShake() {
		return 0;
	}

}
