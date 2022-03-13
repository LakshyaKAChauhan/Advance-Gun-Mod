package net.chauhanDevs.advance_gun_mod.common.items.guns;

import net.chauhanDevs.advance_gun_mod.customs.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class AK_47 extends gunItem {

	public static int magazineSize = 30;
	public AK_47(Properties properties) {
		super(properties);
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity playerIn, Hand handIn) {
		setNbtDataBullets(playerIn, handIn);
		if(!playerIn.getCooldowns().isOnCooldown(this)) {
			gunFiringSys.gunFiringSys(world, playerIn);
			playerIn.getCooldowns().addCooldown(this, 1);
		}
		return super.use(world, playerIn, handIn);
	}

	//functions access able from other files
	public static void reload(){
	}



}
