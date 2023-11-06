
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kiencore.sixteensecondmodsp.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SixteensecondmodspModTabs {
	public static CreativeModeTab TAB_C_TAB;

	public static void load() {
		TAB_C_TAB = new CreativeModeTab("tabc_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SixteensecondmodspModItems.GAMEICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
