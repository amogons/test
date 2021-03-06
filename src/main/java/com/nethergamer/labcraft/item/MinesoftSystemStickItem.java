
package com.nethergamer.labcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.nethergamer.labcraft.init.LabcraftModTabs;
import com.nethergamer.labcraft.init.LabcraftModItems;

public class MinesoftSystemStickItem extends Item {
	public MinesoftSystemStickItem() {
		super(new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAFT_COMPUTER).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(LabcraftModItems.EMPTY_SYSTEM_STICK.get());
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
