package net.chauhanDevs.advance_gun_mod.customs;

import net.chauhanDevs.advance_gun_mod.common.items.guns.AK_47;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;

public class reload {

	public static void reloadMain(){
		if(isGunSelected.isGunSelected()) {
			//setNbtData.nbtBullet = AK_47.magazineSize;
			reloadMessage();
		}
	}

	public static void reloadMessage() {
		System.out.println("Reload Pressed");
	}
	
	
}
