
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IvoGunModModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(IvoGunModModItems.HMMVONEK_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("ivo_gun_mod", "igm"),
				builder -> builder.title(Component.translatable("item_group.ivo_gun_mod.igm")).icon(() -> new ItemStack(IvoGunModModItems.AR_15.get())).displayItems((parameters, tabData) -> {
					tabData.accept(IvoGunModModItems.AR_15.get());
					tabData.accept(IvoGunModModItems.N_556.get());
					tabData.accept(IvoGunModModItems.B_545.get());
					tabData.accept(IvoGunModModItems.AK_74.get());
					tabData.accept(IvoGunModModItems.B_9MM.get());
					tabData.accept(IvoGunModModItems.FORT_12.get());
					tabData.accept(IvoGunModModItems.B_762.get());
					tabData.accept(IvoGunModModItems.SVD.get());
					tabData.accept(IvoGunModModItems.SAIGA_12.get());
					tabData.accept(IvoGunModModItems.G_12.get());
					tabData.accept(IvoGunModModBlocks.MINE.get().asItem());
					tabData.accept(IvoGunModModBlocks.WEPONARY_TABLE.get().asItem());
					tabData.accept(IvoGunModModItems.AK_74GP_25.get());
					tabData.accept(IvoGunModModItems.MM_40.get());
					tabData.accept(IvoGunModModItems.RP_74.get());
					tabData.accept(IvoGunModModItems.GP_25.get());
					tabData.accept(IvoGunModModBlocks.CAMO_MINE.get().asItem());
					tabData.accept(IvoGunModModItems.KALASH.get());
					tabData.accept(IvoGunModModItems.ZIL_SPAWN_EGG.get());
					tabData.accept(IvoGunModModItems.ZILPUSTO_SPAWN_EGG.get());
					tabData.accept(IvoGunModModItems.ZILCARGO_SPAWN_EGG.get());
					tabData.accept(IvoGunModModBlocks.CRAKEDZIL.get().asItem());
				})

		);
	}
}
