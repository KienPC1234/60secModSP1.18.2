package net.kiencore.sixteensecondmodsp.procedures;

import net.minecraft.world.item.ItemStack;

import net.kiencore.sixteensecondmodsp.item.FireAxeItem;

public class FireAxeRightclickedProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() instanceof FireAxeItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.Leviathan Axe.hit");
	}
}
