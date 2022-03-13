package net.chauhanDevs.advance_modder.customs;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class unload {
	public static final void unloadMessage(PlayerEntity p) {
			Minecraft.getInstance().player.displayClientMessage(new StringTextComponent("Gun Reloaded"), false);
	}
}
