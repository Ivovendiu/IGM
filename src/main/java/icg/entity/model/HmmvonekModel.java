package icg.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.entity.HmmvonekEntity;

public class HmmvonekModel extends GeoModel<HmmvonekEntity> {
	@Override
	public ResourceLocation getAnimationResource(HmmvonekEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "animations/hmvv.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HmmvonekEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "geo/hmvv.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HmmvonekEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
