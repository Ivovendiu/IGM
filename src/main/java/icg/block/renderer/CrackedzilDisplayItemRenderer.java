package icg.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import icg.block.model.CrackedzilDisplayModel;
import icg.block.display.CrackedzilDisplayItem;

public class CrackedzilDisplayItemRenderer extends GeoItemRenderer<CrackedzilDisplayItem> {
	public CrackedzilDisplayItemRenderer() {
		super(new CrackedzilDisplayModel());
	}

	@Override
	public RenderType getRenderType(CrackedzilDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
