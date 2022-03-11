
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.labcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.labcraft.item.SteelNuggetItem;
import net.mcreator.labcraft.item.SteelIngotItem;
import net.mcreator.labcraft.item.SteelDustItem;
import net.mcreator.labcraft.item.HammerItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LabcraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item HAMMER = register(new HammerItem());
	public static final Item STEEL_DUST = register(new SteelDustItem());
	public static final Item STEEL_NUGGET = register(new SteelNuggetItem());
	public static final Item STEEL_INGOT = register(new SteelIngotItem());
	public static final Item BLOCK_OF_STEEL = register(LabcraftModBlocks.BLOCK_OF_STEEL, LabcraftModTabs.TAB_LAB_CRAFT);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
