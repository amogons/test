
package com.nethergamer.labcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.nethergamer.labcraft.init.LabcraftModTabs;

public class SteelDustItem extends Item {
	public SteelDustItem() {
		super(new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
