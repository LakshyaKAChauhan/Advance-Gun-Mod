package net.chauhanDevs.advance_modder.common.event;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.chauhanDevs.advance_modder.client.keyBindingsInit;
import net.chauhanDevs.advance_modder.customs.reload;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = advance_gun_mod.ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class InputEvents {
    private InputEvents() {
    }
    
    @SubscribeEvent
    public static void clientTick(ClientTickEvent event) {
    	if(keyBindingsInit.reload.isDown()) {
    		reload.reloadMain();
    	}
    	if(keyBindingsInit.unload.isDown()) {
    		//unload.unloadMessage();
    	}
    	if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
    		//Minecraft.getInstance().player.displayClientMessage(new StringTextComponent("Good To See U"), false);
    	}
    }
}
