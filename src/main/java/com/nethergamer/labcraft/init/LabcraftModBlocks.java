
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nethergamer.labcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.nethergamer.labcraft.block.MinesoftComputerBlock;
import com.nethergamer.labcraft.block.ComputerBlock;
import com.nethergamer.labcraft.block.CableBlock;
import com.nethergamer.labcraft.block.BlockOfSteeldustBlock;
import com.nethergamer.labcraft.block.BlockOfSteelBlock;
import com.nethergamer.labcraft.block.BatteryTier1Block;
import com.nethergamer.labcraft.LabcraftMod;

public class LabcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LabcraftMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_STEEL = REGISTRY.register("block_of_steel", () -> new BlockOfSteelBlock());
	public static final RegistryObject<Block> BLOCK_OF_STEELDUST = REGISTRY.register("block_of_steeldust", () -> new BlockOfSteeldustBlock());
	public static final RegistryObject<Block> BATTERY_TIER_1 = REGISTRY.register("battery_tier_1", () -> new BatteryTier1Block());
	public static final RegistryObject<Block> CABLE = REGISTRY.register("cable", () -> new CableBlock());
	public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());
	public static final RegistryObject<Block> MINESOFT_COMPUTER = REGISTRY.register("minesoft_computer", () -> new MinesoftComputerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CableBlock.registerRenderLayer();
		}
	}
}
