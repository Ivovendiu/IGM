package icg.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import icg.init.IvoGunModModBlockEntities;

import icg.block.renderer.CrackedzilTileRenderer;

import icg.IvoGunModMod;

@Mod.EventBusSubscriber(modid = IvoGunModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(IvoGunModModBlockEntities.CRACKEDZIL.get(), context -> new CrackedzilTileRenderer());
	}
}
