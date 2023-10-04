package icg.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.entity.ZilEntity;

public class ZilModel extends GeoModel<ZilEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZilEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "animations/zil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZilEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "geo/zil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZilEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
