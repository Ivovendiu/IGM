package icg.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.entity.ZilcargoEntity;

public class ZilcargoModel extends GeoModel<ZilcargoEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZilcargoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "animations/zil_cargo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZilcargoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "geo/zil_cargo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZilcargoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
