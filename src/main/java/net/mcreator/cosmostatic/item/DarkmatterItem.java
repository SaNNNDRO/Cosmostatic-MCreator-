
package net.mcreator.cosmostatic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarkmatterItem extends Item {
	public DarkmatterItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
