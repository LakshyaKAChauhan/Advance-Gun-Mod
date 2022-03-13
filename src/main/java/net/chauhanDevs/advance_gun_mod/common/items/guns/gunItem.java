package net.chauhanDevs.advance_gun_mod.common.items.guns;

import net.chauhanDevs.advance_gun_mod.advance_gun_mod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;


public class gunItem extends Item {
    public gunItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
    public static int nbtBullet;
    public static void setNbtDataBullets(PlayerEntity player, Hand hand){
        ItemStack stack = player.getItemInHand(hand);
        CompoundNBT nbt = stack.getTag();
        if (nbt == null) nbt = new CompoundNBT();
        if(player.isCrouching())nbt.putInt("bullets", nbt.getInt("bullets") + 10);
        if (nbt.getInt("bullets") != 0) {
            nbt.putInt("bullets", (nbt.getInt("bullets") - 1));
            stack.setTag(nbt);
        }
    }
/*    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void appendHoverText(ItemStack item, World world, List<ITextComponent> tooltip,
                                ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("tooltip." + advance_gun_mod.ID + ".press.g"));
        tooltip.add(new StringTextComponent("" + item.getTag().getInt("bullet")));
        super.appendHoverText(item, world, tooltip, flag);
    }*/
}
