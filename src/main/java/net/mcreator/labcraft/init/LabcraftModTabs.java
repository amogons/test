
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.labcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LabcraftModTabs {
	public static CreativeModeTab TAB_LAB_CRAFT;

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
	}
}
