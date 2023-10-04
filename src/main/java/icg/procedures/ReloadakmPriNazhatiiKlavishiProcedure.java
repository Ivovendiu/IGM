package icg.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import icg.item.KalashItem;

public class ReloadakmPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getItem() instanceof KalashItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.ak_metro.reload");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.additions")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.additions")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
