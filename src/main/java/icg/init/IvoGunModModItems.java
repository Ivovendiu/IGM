
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import icg.item.Thit5u9hItem;
import icg.item.SvdItem;
import icg.item.Saiga12Item;
import icg.item.Rp74Item;
import icg.item.N556Item;
import icg.item.Mm60Item;
import icg.item.KalashItem;
import icg.item.Gp25Item;
import icg.item.G12Item;
import icg.item.Fort12Item;
import icg.item.B9mmItem;
import icg.item.B762Item;
import icg.item.B545Item;
import icg.item.Ar15Item;
import icg.item.Ak74gp25shootItem;
import icg.item.Ak74gp25Item;
import icg.item.Ak74Item;

import icg.IvoGunModMod;

public class IvoGunModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IvoGunModMod.MODID);
	public static final RegistryObject<Item> AR_15 = REGISTRY.register("ar_15", () -> new Ar15Item());
	public static final RegistryObject<Item> N_556 = REGISTRY.register("n_556", () -> new N556Item());
	public static final RegistryObject<Item> B_545 = REGISTRY.register("b_545", () -> new B545Item());
	public static final RegistryObject<Item> AK_74 = REGISTRY.register("ak_74", () -> new Ak74Item());
	public static final RegistryObject<Item> B_9MM = REGISTRY.register("b_9mm", () -> new B9mmItem());
	public static final RegistryObject<Item> FORT_12 = REGISTRY.register("fort_12", () -> new Fort12Item());
	public static final RegistryObject<Item> B_762 = REGISTRY.register("b_762", () -> new B762Item());
	public static final RegistryObject<Item> SVD = REGISTRY.register("svd", () -> new SvdItem());
	public static final RegistryObject<Item> SAIGA_12 = REGISTRY.register("saiga_12", () -> new Saiga12Item());
	public static final RegistryObject<Item> G_12 = REGISTRY.register("g_12", () -> new G12Item());
	public static final RegistryObject<Item> MINE = block(IvoGunModModBlocks.MINE);
	public static final RegistryObject<Item> WEPONARY_TABLE = block(IvoGunModModBlocks.WEPONARY_TABLE);
	public static final RegistryObject<Item> AK_74GP_25 = REGISTRY.register("ak_74gp_25", () -> new Ak74gp25Item());
	public static final RegistryObject<Item> MM_40 = REGISTRY.register("mm_40", () -> new Mm60Item());
	public static final RegistryObject<Item> AK_74GP_25SHOOT = REGISTRY.register("ak_74gp_25shoot", () -> new Ak74gp25shootItem());
	public static final RegistryObject<Item> RP_74 = REGISTRY.register("rp_74", () -> new Rp74Item());
	public static final RegistryObject<Item> GP_25 = REGISTRY.register("gp_25", () -> new Gp25Item());
	public static final RegistryObject<Item> CAMO_MINE = block(IvoGunModModBlocks.CAMO_MINE);
	public static final RegistryObject<Item> KALASH = REGISTRY.register("kalash", () -> new KalashItem());
	public static final RegistryObject<Item> ZIL_SPAWN_EGG = REGISTRY.register("zil_spawn_egg", () -> new ForgeSpawnEggItem(IvoGunModModEntities.ZIL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> ZILPUSTO_SPAWN_EGG = REGISTRY.register("zilpusto_spawn_egg", () -> new ForgeSpawnEggItem(IvoGunModModEntities.ZILPUSTO, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> ZILCARGO_SPAWN_EGG = REGISTRY.register("zilcargo_spawn_egg", () -> new ForgeSpawnEggItem(IvoGunModModEntities.ZILCARGO, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CRAKEDZIL = block(IvoGunModModBlocks.CRAKEDZIL);
	public static final RegistryObject<Item> HMMVONEK_SPAWN_EGG = REGISTRY.register("hmmvonek_spawn_egg", () -> new ForgeSpawnEggItem(IvoGunModModEntities.HMMVONEK, -10040320, -16738048, new Item.Properties()));
	public static final RegistryObject<Item> THIT_5U_9H = REGISTRY.register("thit_5u_9h", () -> new Thit5u9hItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
