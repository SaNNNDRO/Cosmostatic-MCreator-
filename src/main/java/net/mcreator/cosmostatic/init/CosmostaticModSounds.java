
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CosmostaticMod.MODID);
	public static final RegistryObject<SoundEvent> TRANSDUCER_SOUND = REGISTRY.register("transducer_sound", () -> new SoundEvent(new ResourceLocation("cosmostatic", "transducer_sound")));
}
