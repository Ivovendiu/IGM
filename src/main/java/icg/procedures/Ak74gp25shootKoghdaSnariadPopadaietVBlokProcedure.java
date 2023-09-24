package icg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class Ak74gp25shootKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.MOB);
	}
}
