
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CosmostaticModTabs {
	public static CreativeModeTab TAB_COSMOSTATIC;

	public static void load() {
		TAB_COSMOSTATIC = new CreativeModeTab("tabcosmostatic") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CosmostaticModItems.DARKMATTER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
