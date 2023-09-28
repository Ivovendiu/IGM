
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import icg.IvoGunModMod;

public class IvoGunModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, IvoGunModMod.MODID);
	public static final RegistryObject<SoundEvent> AR15_SHOOT = REGISTRY.register("ar15_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "ar15_shoot")));
	public static final RegistryObject<SoundEvent> AK74 = REGISTRY.register("ak74", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "ak74")));
	public static final RegistryObject<SoundEvent> FORT_SHOOT = REGISTRY.register("fort_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "fort_shoot")));
	public static final RegistryObject<SoundEvent> SVD = REGISTRY.register("svd", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "svd")));
	public static final RegistryObject<SoundEvent> SAIGA12 = REGISTRY.register("saiga12", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "saiga12")));
	public static final RegistryObject<SoundEvent> UBG_40_SHOOT = REGISTRY.register("ubg_40_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "ubg_40_shoot")));
	public static final RegistryObject<SoundEvent> AKM_SHOOT = REGISTRY.register("akm_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ivo_gun_mod", "akm_shoot")));
}
