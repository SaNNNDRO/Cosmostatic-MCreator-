
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cosmostatic.world.inventory.SpaceWorkbenchguiMenu;
import net.mcreator.cosmostatic.world.inventory.ParticleaccguiMenu;
import net.mcreator.cosmostatic.CosmostaticMod;

public class CosmostaticModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CosmostaticMod.MODID);
	public static final RegistryObject<MenuType<ParticleaccguiMenu>> PARTICLEACCGUI = REGISTRY.register("particleaccgui", () -> IForgeMenuType.create(ParticleaccguiMenu::new));
	public static final RegistryObject<MenuType<SpaceWorkbenchguiMenu>> SPACE_WORKBENCHGUI = REGISTRY.register("space_workbenchgui", () -> IForgeMenuType.create(SpaceWorkbenchguiMenu::new));
}
