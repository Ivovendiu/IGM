package icg.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.entity.ZilpustoEntity;

public class ZilpustoModel extends GeoModel<ZilpustoEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZilpustoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "animations/zil_pusto.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZilpustoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "geo/zil_pusto.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZilpustoEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
