
package com.nethergamer.labcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import com.nethergamer.labcraft.procedures.ProtosaberRechargeProcedure;
import com.nethergamer.labcraft.init.LabcraftModTabs;
import com.nethergamer.labcraft.init.LabcraftModItems;

public class ProtosaberItem extends SwordItem {
	public ProtosaberItem() {
		super(new Tier() {
			public int getUses() {
				return 750;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LabcraftModItems.ENERGY_BACKPACK_CHESTPLATE.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAF_TOOLS_AND_ARMOR));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ProtosaberRechargeProcedure.execute(entity, itemstack);
	}
}
