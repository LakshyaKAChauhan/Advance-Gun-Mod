package net.chauhanDevs.advance_modder.customs;

import net.chauhanDevs.advance_modder.common.items.guns.gunItem;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;

public class reload {

	public static void reloadMain(){
		/*assert Minecraft.getInstance().player != null;
		Hand hand ;
		PlayerEntity player = Minecraft.getInstance().player;
		int tB = gunItem.tB;
		ItemStack stack = player.getItemInHand(hand);
		CompoundNBT nbt;

		if (stack.hasTag()) {
			nbt = stack.getTag();
		} else {
			nbt = new CompoundNBT();
		}
		assert nbt != null;
		nbt.putInt("bullets", tB);*/
		reloadMessage();
	}

	public static void reloadMessage() {
		System.out.println("Reload Pressed");
	}
	
	
}
