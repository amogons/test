
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.labcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.labcraft.item.SteelNuggetItem;
import net.mcreator.labcraft.item.SteelIngotItem;
import net.mcreator.labcraft.item.SteelDustItem;
import net.mcreator.labcraft.item.HammerItem;
import net.mcreator.labcraft.LabcraftMod;

public class LabcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LabcraftMod.MODID);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> STEEL_DUST = REGISTRY.register("steel_dust", () -> new SteelDustItem());
	public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_STEEL = block(LabcraftModBlocks.BLOCK_OF_STEEL, LabcraftModTabs.TAB_LAB_CRAFT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
