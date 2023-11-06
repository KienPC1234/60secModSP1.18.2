
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kiencore.sixteensecondmodsp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.kiencore.sixteensecondmodsp.item.GameiconItem;
import net.kiencore.sixteensecondmodsp.SixteensecondmodspMod;

public class SixteensecondmodspModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SixteensecondmodspMod.MODID);
	public static final RegistryObject<Item> GAMEICON = REGISTRY.register("gameicon", () -> new GameiconItem());
}
