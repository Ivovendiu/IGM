package icg.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.item.KalashItem;

public class KalashItemModel extends GeoModel<KalashItem> {
	@Override
	public ResourceLocation getAnimationResource(KalashItem animatable) {
		return new ResourceLocation("ivo_gun_mod", "animations/ak_metro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KalashItem animatable) {
		return new ResourceLocation("ivo_gun_mod", "geo/ak_metro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KalashItem animatable) {
		return new ResourceLocation("ivo_gun_mod", "textures/item/ak_m_texture.png");
	}
}
