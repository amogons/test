
package net.mcreator.labcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.labcraft.init.LabcraftModTabs;

public class SteelNuggetItem extends Item {
	public SteelNuggetItem() {
		super(new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("steel_nugget");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
