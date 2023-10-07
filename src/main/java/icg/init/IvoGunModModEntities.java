
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

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

import icg.entity.ZilpustoEntity;
import icg.entity.ZilcargoEntity;
import icg.entity.ZilEntity;
import icg.entity.SvdEntity;
import icg.entity.Saiga12Entity;
import icg.entity.Rp74Entity;
import icg.entity.HmmvonekEntity;
import icg.entity.Fort12Entity;
import icg.entity.Ar15Entity;
import icg.entity.Ak74gp25shootEntity;
import icg.entity.Ak74gp25Entity;
import icg.entity.Ak74Entity;

import icg.IvoGunModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IvoGunModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IvoGunModMod.MODID);
	public static final RegistryObject<EntityType<Ar15Entity>> AR_15 = register("projectile_ar_15",
			EntityType.Builder.<Ar15Entity>of(Ar15Entity::new, MobCategory.MISC).setCustomClientFactory(Ar15Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Ak74Entity>> AK_74 = register("projectile_ak_74",
			EntityType.Builder.<Ak74Entity>of(Ak74Entity::new, MobCategory.MISC).setCustomClientFactory(Ak74Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fort12Entity>> FORT_12 = register("projectile_fort_12",
			EntityType.Builder.<Fort12Entity>of(Fort12Entity::new, MobCategory.MISC).setCustomClientFactory(Fort12Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SvdEntity>> SVD = register("projectile_svd",
			EntityType.Builder.<SvdEntity>of(SvdEntity::new, MobCategory.MISC).setCustomClientFactory(SvdEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Saiga12Entity>> SAIGA_12 = register("projectile_saiga_12",
			EntityType.Builder.<Saiga12Entity>of(Saiga12Entity::new, MobCategory.MISC).setCustomClientFactory(Saiga12Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Ak74gp25Entity>> AK_74GP_25 = register("projectile_ak_74gp_25",
			EntityType.Builder.<Ak74gp25Entity>of(Ak74gp25Entity::new, MobCategory.MISC).setCustomClientFactory(Ak74gp25Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Ak74gp25shootEntity>> AK_74GP_25SHOOT = register("projectile_ak_74gp_25shoot",
			EntityType.Builder.<Ak74gp25shootEntity>of(Ak74gp25shootEntity::new, MobCategory.MISC).setCustomClientFactory(Ak74gp25shootEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Rp74Entity>> RP_74 = register("projectile_rp_74",
			EntityType.Builder.<Rp74Entity>of(Rp74Entity::new, MobCategory.MISC).setCustomClientFactory(Rp74Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZilEntity>> ZIL = register("zil",
			EntityType.Builder.<ZilEntity>of(ZilEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZilEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<ZilpustoEntity>> ZILPUSTO = register("zilpusto",
			EntityType.Builder.<ZilpustoEntity>of(ZilpustoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZilpustoEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<ZilcargoEntity>> ZILCARGO = register("zilcargo",
			EntityType.Builder.<ZilcargoEntity>of(ZilcargoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZilcargoEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<HmmvonekEntity>> HMMVONEK = register("hmmvonek",
			EntityType.Builder.<HmmvonekEntity>of(HmmvonekEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HmmvonekEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZilEntity.init();
			ZilpustoEntity.init();
			ZilcargoEntity.init();
			HmmvonekEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZIL.get(), ZilEntity.createAttributes().build());
		event.put(ZILPUSTO.get(), ZilpustoEntity.createAttributes().build());
		event.put(ZILCARGO.get(), ZilcargoEntity.createAttributes().build());
		event.put(HMMVONEK.get(), HmmvonekEntity.createAttributes().build());
	}
}
