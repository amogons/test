
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
import com.nethergamer.labcraft.item.RedLightSaberItem;
import com.nethergamer.labcraft.item.ProtosaberItem;
import com.nethergamer.labcraft.item.NailItem;
import com.nethergamer.labcraft.item.MinesoftSystemStickItem;
import com.nethergamer.labcraft.item.HammerItem;
import com.nethergamer.labcraft.item.EnergyBackpackItem;
import com.nethergamer.labcraft.item.EmptySystemStickItem;
import com.nethergamer.labcraft.item.DarkSaberItem;
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
	public static final RegistryObject<Item> MOON_STONE = block(LabcraftModBlocks.MOON_STONE, LabcraftModTabs.TAB_LAB_CRAFT_SPACE);
	public static final RegistryObject<Item> ENERGY_BACKPACK_CHESTPLATE = REGISTRY.register("energy_backpack_chestplate",
			() -> new EnergyBackpackItem.Chestplate());
	public static final RegistryObject<Item> DARK_SABER = REGISTRY.register("dark_saber", () -> new DarkSaberItem());
	public static final RegistryObject<Item> RED_LIGHT_SABER = REGISTRY.register("red_light_saber", () -> new RedLightSaberItem());
	public static final RegistryObject<Item> PROTOSABER = REGISTRY.register("protosaber", () -> new ProtosaberItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
