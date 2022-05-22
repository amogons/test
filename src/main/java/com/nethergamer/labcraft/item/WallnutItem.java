
package com.nethergamer.labcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class WallnutItem extends Item {
	public WallnutItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 15;
	}
}
