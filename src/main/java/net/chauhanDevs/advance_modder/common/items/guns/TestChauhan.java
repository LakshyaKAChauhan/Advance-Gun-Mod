package net.chauhanDevs.advance_modder.common.items.guns;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.World;

import java.util.List;

public class TestChauhan extends Item
{

    public TestChauhan(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack stack = playerIn.getItemInHand(handIn);
        CompoundNBT nbt;
        if (stack.hasTag()) {
            nbt = stack.getTag();
        } else {
            nbt = new CompoundNBT();
        }
        if(!playerIn.isCrouching()){

            assert nbt != null;
            nbt.putInt("Uses", nbt.getInt("Uses") + 1);
            stack.setTag(nbt);
        }else{
            assert nbt != null;
            playerIn.displayClientMessage(new StringTextComponent("" + nbt.getInt("Uses")), true);
        }
        return super.use(world, playerIn, handIn);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip,
                                ITooltipFlag flag) {
        if (stack.hasTag()) {
            assert stack.getTag() != null;
            if (stack.getTag().hasUUID("Uses")) {
                assert stack.getTag() != null;
                tooltip.add(new StringTextComponent("" + stack.getTag().getInt("bullet")));
            }
        }
    }
}