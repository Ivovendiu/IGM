package icg.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.block.display.CrackedzilDisplayItem;

public class CrackedzilDisplayModel extends GeoModel<CrackedzilDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CrackedzilDisplayItem animatable) {
		return new ResourceLocation("ivo_gun_mod", "animations/zil_craked_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrackedzilDisplayItem animatable) {
		return new ResourceLocation("ivo_gun_mod", "geo/zil_craked_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrackedzilDisplayItem entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/block/zil_texture.png");
	}
}
