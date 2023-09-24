
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IvoGunModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(IvoGunModModEntities.AR_15.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.AK_74.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.FORT_12.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.SVD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.SAIGA_12.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.AK_74GP_25.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.AK_74GP_25SHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IvoGunModModEntities.RP_74.get(), ThrownItemRenderer::new);
	}
}
