
package net.mcreator.cosmostatic.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cosmostatic.init.CosmostaticModItems;

public class Darkmatter_insShovelItem extends ShovelItem {
	public Darkmatter_insShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CosmostaticModItems.DARKMATTER.get()));
			}
		}, 1, -3f, new Item.Properties().tab(null));
	}
}
