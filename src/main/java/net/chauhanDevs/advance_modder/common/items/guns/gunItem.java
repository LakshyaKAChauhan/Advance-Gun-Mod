/*package net.chauhanDevs.advance_modder.common.items.guns;

import net.chauhanDevs.advance_modder.client.keyBindingsInit;
import net.chauhanDevs.advance_modder.customs.lib.gunItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AK_47 extends Item {
	public AK_47(Properties p) {
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
}*/
package net.chauhanDevs.advance_modder.common.items.guns;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.chauhanDevs.advance_modder.client.keyBindingsInit;

import javax.annotation.Nullable;
import java.util.List;

public class gunItem extends Item {
    public gunItem(Properties properties) {
        super(properties);
    }
    @Override
    public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
        return false;
    }
    //public static PlayerEntity player = Minecraft.getInstance().player;
    //public static Hand hand = Minecraft.getInstance().player.getUsedItemHand();
    public static int tB = 40;
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getItemInHand(hand);
        CompoundNBT nbt = stack.getTag();
        return super.use(world, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world,
                                List<ITextComponent> tooltip, ITooltipFlag flag) {

        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Mod.EventBusSubscriber(modid = advance_gun_mod.ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
    public class test{
        @SubscribeEvent
        void test2(TickEvent.ClientTickEvent event){
            if(keyBindingsInit.reload.isDown()){

            }
        }
    }

}

