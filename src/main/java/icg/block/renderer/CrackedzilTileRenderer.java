package icg.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import icg.block.model.CrackedzilBlockModel;
import icg.block.entity.CrackedzilTileEntity;

public class CrackedzilTileRenderer extends GeoBlockRenderer<CrackedzilTileEntity> {
	public CrackedzilTileRenderer() {
		super(new CrackedzilBlockModel());
	}

	@Override
	public RenderType getRenderType(CrackedzilTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
