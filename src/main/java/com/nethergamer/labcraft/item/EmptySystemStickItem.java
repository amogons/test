
package com.nethergamer.labcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.nethergamer.labcraft.init.LabcraftModTabs;

public class EmptySystemStickItem extends Item {
	public EmptySystemStickItem() {
		super(new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAFT_COMPUTER).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
