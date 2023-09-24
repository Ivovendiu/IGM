package icg.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

import icg.init.IvoGunModModItems;
import icg.init.IvoGunModModBlocks;

public class AKtogp25Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == IvoGunModModItems.AK_74.get()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == IvoGunModModItems.GP_25.get()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(IvoGunModModItems.AK_74GP_25.get());
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == IvoGunModModBlocks.MINE.get()
				.asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.GRASS.asItem()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(IvoGunModModBlocks.CAMO_MINE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
