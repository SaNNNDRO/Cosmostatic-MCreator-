
package net.mcreator.cosmostatic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.cosmostatic.init.CosmostaticModTabs;

public class SpacemetalItem extends Item {
	public SpacemetalItem() {
		super(new Item.Properties().tab(CosmostaticModTabs.TAB_COSMOSTATIC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
