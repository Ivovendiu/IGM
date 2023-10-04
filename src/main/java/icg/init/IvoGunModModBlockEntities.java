
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import icg.block.entity.WeponaryTableBlockEntity;
import icg.block.entity.CrackedzilTileEntity;

import icg.IvoGunModMod;

public class IvoGunModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, IvoGunModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WEPONARY_TABLE = register("weponary_table", IvoGunModModBlocks.WEPONARY_TABLE, WeponaryTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CrackedzilTileEntity>> CRACKEDZIL = REGISTRY.register("crackedzil", () -> BlockEntityType.Builder.of(CrackedzilTileEntity::new, IvoGunModModBlocks.CRACKEDZIL.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
