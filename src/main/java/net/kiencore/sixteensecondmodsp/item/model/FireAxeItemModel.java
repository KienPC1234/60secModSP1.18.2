package net.kiencore.sixteensecondmodsp.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.kiencore.sixteensecondmodsp.item.FireAxeItem;

public class FireAxeItemModel extends AnimatedGeoModel<FireAxeItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(FireAxeItem animatable) {
		return new ResourceLocation("sixteensecondmodsp", "animations/leviathan_axe.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FireAxeItem animatable) {
		return new ResourceLocation("sixteensecondmodsp", "geo/leviathan_axe.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FireAxeItem animatable) {
		return new ResourceLocation("sixteensecondmodsp", "textures/items/14649281-9e85-4af3-9078-40180346fd11.png");
	}
}
