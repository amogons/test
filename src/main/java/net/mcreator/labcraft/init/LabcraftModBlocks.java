
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.labcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.labcraft.block.BlockOfSteelBlock;
import net.mcreator.labcraft.LabcraftMod;

public class LabcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LabcraftMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_STEEL = REGISTRY.register("block_of_steel", () -> new BlockOfSteelBlock());
}
