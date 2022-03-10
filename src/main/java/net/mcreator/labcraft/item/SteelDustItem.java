
package net.mcreator.labcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.labcraft.itemgroup.LabCraftItemGroup;
import net.mcreator.labcraft.LabcraftModElements;

@LabcraftModElements.ModElement.Tag
public class SteelDustItem extends LabcraftModElements.ModElement {
	@ObjectHolder("labcraft:steel_dust")
	public static final Item block = null;

	public SteelDustItem(LabcraftModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LabCraftItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("steel_dust");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
