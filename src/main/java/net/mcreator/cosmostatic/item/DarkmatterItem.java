
package net.mcreator.cosmostatic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cosmostatic.procedures.DmdropProcedure;
import net.mcreator.cosmostatic.init.CosmostaticModTabs;

public class DarkmatterItem extends Item {
	public DarkmatterItem() {
		super(new Item.Properties().tab(CosmostaticModTabs.TAB_COSMOSTATIC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DmdropProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}
