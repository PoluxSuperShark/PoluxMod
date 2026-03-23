
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.poluxsupershark.init;

import net.poluxsupershark.entity.TrainControllerEntity;
import net.poluxsupershark.entity.Entity306Entity;
import net.poluxsupershark.PoluxsupersharkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoluxsupersharkModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PoluxsupersharkMod.MODID);
	public static final RegistryObject<EntityType<Entity306Entity>> ENTITY_306 = register("entity_306",
			EntityType.Builder.<Entity306Entity>of(Entity306Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity306Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TrainControllerEntity>> TRAIN_CONTROLLER = register("train_controller",
			EntityType.Builder.<TrainControllerEntity>of(TrainControllerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrainControllerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Entity306Entity.init();
			TrainControllerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENTITY_306.get(), Entity306Entity.createAttributes().build());
		event.put(TRAIN_CONTROLLER.get(), TrainControllerEntity.createAttributes().build());
	}
}
