
package icg.item;

import net.minecraft.network.chat.Component;

public class Thit5u9hItem extends RecordItem {

	public Thit5u9hItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ivo_gun_mod:ubg_40_shoot")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}

}
