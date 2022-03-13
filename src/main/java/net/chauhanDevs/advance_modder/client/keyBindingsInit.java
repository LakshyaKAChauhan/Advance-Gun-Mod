package net.chauhanDevs.advance_modder.client;

import java.awt.event.KeyEvent;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public final class keyBindingsInit {
	private keyBindingsInit(){
	}
	
	
	public static KeyBinding unload;
	public static KeyBinding reload;
	
	
	
	public static void register(FMLClientSetupEvent event) {
		reload = create("reload", KeyEvent.VK_R);
		unload = create("unload", KeyEvent.VK_U);
		
		
		
		
		ClientRegistry.registerKeyBinding(unload);
		ClientRegistry.registerKeyBinding(reload);
		
	}
	
	
	private static KeyBinding create(String name, int key){
        return new KeyBinding("key." + advance_gun_mod.ID + "." + name, key, "key.category." + advance_gun_mod.ID);
    }
}
