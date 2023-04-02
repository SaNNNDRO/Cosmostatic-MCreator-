
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmostatic.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.cosmostatic.client.gui.SpaceWorkbenchguiScreen;
import net.mcreator.cosmostatic.client.gui.ParticleaccguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CosmostaticModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CosmostaticModMenus.PARTICLEACCGUI.get(), ParticleaccguiScreen::new);
			MenuScreens.register(CosmostaticModMenus.SPACE_WORKBENCHGUI.get(), SpaceWorkbenchguiScreen::new);
		});
	}
}
