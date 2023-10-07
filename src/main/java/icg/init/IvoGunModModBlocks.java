
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import icg.block.WeponaryTableBlock;
import icg.block.MineBlock;
import icg.block.CrakedzilBlock;
import icg.block.CamoMineBlock;

import icg.IvoGunModMod;

public class IvoGunModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IvoGunModMod.MODID);
	public static final RegistryObject<Block> MINE = REGISTRY.register("mine", () -> new MineBlock());
	public static final RegistryObject<Block> WEPONARY_TABLE = REGISTRY.register("weponary_table", () -> new WeponaryTableBlock());
	public static final RegistryObject<Block> CAMO_MINE = REGISTRY.register("camo_mine", () -> new CamoMineBlock());
	public static final RegistryObject<Block> CRAKEDZIL = REGISTRY.register("crakedzil", () -> new CrakedzilBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CamoMineBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			CamoMineBlock.itemColorLoad(event);
		}
	}
}
