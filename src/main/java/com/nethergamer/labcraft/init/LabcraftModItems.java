
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nethergamer.labcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.nethergamer.labcraft.item.SteelNuggetItem;
import com.nethergamer.labcraft.item.SteelIngotItem;
import com.nethergamer.labcraft.item.SteelDustItem;
import com.nethergamer.labcraft.item.StapleItem;
import com.nethergamer.labcraft.item.ScrewdriverItem;
import com.nethergamer.labcraft.item.NailItem;
import com.nethergamer.labcraft.item.MinesoftSystemStickItem;
import com.nethergamer.labcraft.item.HammerItem;
import com.nethergamer.labcraft.item.EmptySystemStickItem;
import com.nethergamer.labcraft.LabcraftMod;

public class LabcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LabcraftMod.MODID);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> STAPLE = REGISTRY.register("staple", () -> new StapleItem());
	public static final RegistryObject<Item> SCREWDRIVER = REGISTRY.register("screwdriver", () -> new ScrewdriverItem());
	public static final RegistryObject<Item> NAIL = REGISTRY.register("nail", () -> new NailItem());
	public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_STEEL = block(LabcraftModBlocks.BLOCK_OF_STEEL, LabcraftModTabs.TAB_LAB_CRAFT);
	public static final RegistryObject<Item> STEEL_DUST = REGISTRY.register("steel_dust", () -> new SteelDustItem());
	public static final RegistryObject<Item> BLOCK_OF_STEELDUST = block(LabcraftModBlocks.BLOCK_OF_STEELDUST, LabcraftModTabs.TAB_LAB_CRAFT);
	public static final RegistryObject<Item> COMPUTER = block(LabcraftModBlocks.COMPUTER, LabcraftModTabs.TAB_LAB_CRAFT);
	public static final RegistryObject<Item> MINESOFT_COMPUTER = block(LabcraftModBlocks.MINESOFT_COMPUTER, LabcraftModTabs.TAB_LAB_CRAFT);
	public static final RegistryObject<Item> BATTERY_TIER_1 = block(LabcraftModBlocks.BATTERY_TIER_1, LabcraftModTabs.TAB_LAB_CRAFT_ENERGY);
	public static final RegistryObject<Item> MINESOFT_SYSTEM_STICK = REGISTRY.register("minesoft_system_stick", () -> new MinesoftSystemStickItem());
	public static final RegistryObject<Item> EMPTY_SYSTEM_STICK = REGISTRY.register("empty_system_stick", () -> new EmptySystemStickItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
