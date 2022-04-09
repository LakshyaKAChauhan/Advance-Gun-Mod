package net.chauhanDevs.advance_modder.common.items.guns;

import net.chauhanDevs.advance_modder.customs.lib.gunItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class gun extends Item {
	public gun(Properties p) {
		super(p);
	}
	public static int totalBullets = 40;
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn,
                                       Hand handIn) {
		gunItem.use(playerIn, handIn, totalBullets);
		return super.use(worldIn, playerIn, handIn);
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World world,
                                List<ITextComponent> tooltip, ITooltipFlag flag) {
		gunItem.appendHoverText(stack, tooltip, totalBullets);
		super.appendHoverText(stack, world, tooltip, flag);
	}
}