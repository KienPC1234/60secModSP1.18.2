package net.kiencore.sixteensecondmodsp.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.WorldEvent;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.File;

@Mod.EventBusSubscriber
public class TakeVar1Procedure {
	@SubscribeEvent
	public static void onWorldLoad(WorldEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File File = new File("");
		File = new File((FMLPaths.GAMEDIR.get().toString() + "/config"), File.separator + "plrdata.json");
		if (!File.exists()) {
			try {
				File.getParentFile().mkdirs();
				File.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}
}
