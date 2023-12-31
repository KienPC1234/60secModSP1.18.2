
package net.kiencore.sixteensecondmodsp.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.kiencore.sixteensecondmodsp.procedures.GameiconItemInHandTickProcedure;
import net.kiencore.sixteensecondmodsp.init.SixteensecondmodspModTabs;

public class GameiconItem extends Item {
	public GameiconItem() {
		super(new Item.Properties().tab(SixteensecondmodspModTabs.TAB_C_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			GameiconItemInHandTickProcedure.execute(entity);
	}
}
