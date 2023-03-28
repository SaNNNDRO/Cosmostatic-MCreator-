
package net.mcreator.cosmostatic.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cosmostatic.init.CosmostaticModTabs;

public class FlaskdarkmatterItem extends Item {
	public FlaskdarkmatterItem() {
		super(new Item.Properties().tab(CosmostaticModTabs.TAB_COSMOSTATIC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
