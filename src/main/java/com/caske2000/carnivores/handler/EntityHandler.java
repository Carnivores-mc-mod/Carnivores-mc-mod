package com.caske2000.carnivores.handler;

import net.minecraft.entity.EntityList;

import com.caske2000.carnivores.Carnivores;
import com.caske2000.carnivores.entity.EntityBullet;
import com.caske2000.carnivores.entity.EntityCeratosaurus;
import com.caske2000.carnivores.entity.EntityIndricotherium;
import com.caske2000.carnivores.entity.EntitySuchomimus;
import com.caske2000.carnivores.entity.EntityUtahraptor;
import com.caske2000.carnivores.entity.EntityXBowBolt;

import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void init() {

		registerEntity();

	}

	public static void registerEntity() {

		int id;

		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "Bullet", id = EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "Bullet", id, Carnivores.instance, 120, 1, true);
		EntityRegistry.registerModEntity(EntityXBowBolt.class, "XBow Bolt", id, Carnivores.instance, 120, 1, true);

		createEntity(EntityUtahraptor.class, "Utahraptor", 64, 1, true, 0x8B8782, 0x5B5550);
		createEntity(EntityCeratosaurus.class, "Ceratosaurus", 64, 1, true, 0xFD3D12, 0x1D1D1D); 
		createEntity(EntityIndricotherium.class, "Indricotherium", 64, 1, true, 0xFD3D12, 0x1D1D1D);
		createEntity(EntitySuchomimus.class, "Suchomimus", 64, 1, true, 0x0A3D11, 0xFFBF29);
	}

	public static void createEntity(Class entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendVelocityUpdates,
			int solidColour, int spotColour) {

		int randomID = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, Carnivores.instance, trackingRange, updateFrequency, sendVelocityUpdates);

		createEgg(solidColour, spotColour, randomID);

	}

	// Use: createEgg(0x + HexCode, 0x + HexCode);
	public static void createEgg(int solidColour, int spotColour, int randomID) {

		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
	}
}
