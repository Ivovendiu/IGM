
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package icg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import icg.world.inventory.WeponaryTableUIMenu;

import icg.IvoGunModMod;

public class IvoGunModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, IvoGunModMod.MODID);
	public static final RegistryObject<MenuType<WeponaryTableUIMenu>> WEPONARY_TABLE_UI = REGISTRY.register("weponary_table_ui", () -> IForgeMenuType.create(WeponaryTableUIMenu::new));
}
