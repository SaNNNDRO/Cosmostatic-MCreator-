
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cosmostatic.world.inventory.ParticleacceleratorguiMenu;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CosmostaticMod.MODID);
	public static final RegistryObject<MenuType<ParticleacceleratorguiMenu>> PARTICLEACCELERATORGUI = REGISTRY.register("particleacceleratorgui",
			() -> IForgeMenuType.create(ParticleacceleratorguiMenu::new));
}
