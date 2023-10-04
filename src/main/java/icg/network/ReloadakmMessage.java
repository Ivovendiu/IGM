
package icg.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;

import icg.IvoGunModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReloadakmMessage {
	int type, pressedms;

	public ReloadakmMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ReloadakmMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ReloadakmMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ReloadakmMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IvoGunModMod.addNetworkMessage(ReloadakmMessage.class, ReloadakmMessage::buffer, ReloadakmMessage::new, ReloadakmMessage::handler);
	}
}
