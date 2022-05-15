
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.nethergamer.labcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LabcraftModTabs {
	public static CreativeModeTab TAB_LAB_CRAFT;
	public static CreativeModeTab TAB_LAB_CRAFT_ENERGY;
	public static CreativeModeTab TAB_LAB_CRAFT_COMPUTER;
	public static CreativeModeTab TAB_LAB_CRAFT_SPACE;
	public static CreativeModeTab TAB_LAB_CRAF_TOOLS_AND_ARMOR;

	public static void load() {
		TAB_LAB_CRAFT = new CreativeModeTab("tablab_craft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.BLAZE_POWDER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LAB_CRAFT_ENERGY = new CreativeModeTab("tablab_craft_energy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.REDSTONE_TORCH);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LAB_CRAFT_COMPUTER = new CreativeModeTab("tablab_craft_computer") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.REDSTONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LAB_CRAFT_SPACE = new CreativeModeTab("tablab_craft_space") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.END_GATEWAY);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LAB_CRAF_TOOLS_AND_ARMOR = new CreativeModeTab("tablab_craf_tools_and_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.NETHERITE_PICKAXE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
