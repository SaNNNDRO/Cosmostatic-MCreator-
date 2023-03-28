
package net.mcreator.cosmostatic.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cosmostatic.procedures.CollapsarprocedureProcedure;

public class CollapsareffectMobEffect extends MobEffect {
	public CollapsareffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cosmostatic.collapsareffect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CollapsarprocedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
