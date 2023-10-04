package icg.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import icg.block.entity.CrackedzilTileEntity;

public class CrackedzilBlockModel extends GeoModel<CrackedzilTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrackedzilTileEntity animatable) {
		return new ResourceLocation("ivo_gun_mod", "animations/zil_craked_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrackedzilTileEntity animatable) {
		return new ResourceLocation("ivo_gun_mod", "geo/zil_craked_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrackedzilTileEntity entity) {
		return new ResourceLocation("ivo_gun_mod", "textures/block/zil_texture.png");
	}
}
