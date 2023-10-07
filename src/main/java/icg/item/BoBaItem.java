
package icg.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BoBaItem extends Item {
	public BoBaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
