
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.cosmostatic.potion.CollapsareffectMobEffect;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CosmostaticMod.MODID);
	public static final RegistryObject<MobEffect> COLLAPSAREFFECT = REGISTRY.register("collapsareffect", () -> new CollapsareffectMobEffect());
}
