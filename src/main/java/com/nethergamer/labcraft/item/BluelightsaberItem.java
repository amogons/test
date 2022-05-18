
package com.nethergamer.labcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import com.nethergamer.labcraft.init.LabcraftModTabs;

public class BluelightsaberItem extends SwordItem {
	public BluelightsaberItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 4f, new Item.Properties().tab(LabcraftModTabs.TAB_LAB_CRAF_TOOLS_AND_ARMOR));
	}
}
