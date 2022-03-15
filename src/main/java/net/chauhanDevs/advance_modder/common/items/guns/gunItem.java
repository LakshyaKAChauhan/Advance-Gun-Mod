package net.chauhanDevs.advance_modder.common.items.guns;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class gunItem extends Item {
    public gunItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    private static final int totalBullets = 10;
    ItemStack overStack;

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getItemInHand(handIn);
        CompoundNBT nbt;
        if (stack.hasTag())
        {
            nbt = stack.getTag();
        }
        else
        {
            nbt = new CompoundNBT();
        }

        if (nbt.hasUUID("bullets"))
        {
            nbt.putInt("bullets", nbt.getInt("bullets") + 1);
        }
        else
        {
            nbt.putInt("bullets",1);
        }
        stack.setTag(nbt);
        overStack = stack;
        if(playerIn.isCrouching()){
            playerIn.displayClientMessage(new StringTextComponent("" + nbt.getInt("bullets")), true);
        }
        return super.use(world, playerIn, handIn);
    }
    @Override
    public void appendHoverText(ItemStack item, World world, List<ITextComponent> tooltip,
                                ITooltipFlag flag) {
        String bullets = Integer.toString(totalBullets);
        CompoundNBT nbt = item.getTag();
        tooltip.add(new TranslationTextComponent("tooltip." + advance_gun_mod.ID + ".press.g"));
        //tooltip.add(new StringTextComponent("" + item.getTag().getInt("bullet")))
        String result = null;
        if (nbt != null) {
            tooltip.add(new StringTextComponent(bullets + "/" + nbt.getInt("bullets")));
            //result = Integer.toString(nbt.getInt("bullets"));
        }else{
        }

        item.setTag(nbt);
        super.appendHoverText(item, world, tooltip, flag);
    }
}
