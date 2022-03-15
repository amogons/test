
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nethergamer.labcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.nethergamer.labcraft.block.entity.CableBlockEntity;
import com.nethergamer.labcraft.block.entity.BatteryTier1BlockEntity;
import com.nethergamer.labcraft.LabcraftMod;

public class LabcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, LabcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_TIER_1 = register("battery_tier_1", LabcraftModBlocks.BATTERY_TIER_1,
			BatteryTier1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE = register("cable", LabcraftModBlocks.CABLE, CableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
