
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nethergamer.labcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.nethergamer.labcraft.client.gui.MinesoftMainScreen;
import com.nethergamer.labcraft.client.gui.MinesoftETraderScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LabcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LabcraftModMenus.MINESOFT_MAIN, MinesoftMainScreen::new);
			MenuScreens.register(LabcraftModMenus.MINESOFT_E_TRADER, MinesoftETraderScreen::new);
		});
	}
}
