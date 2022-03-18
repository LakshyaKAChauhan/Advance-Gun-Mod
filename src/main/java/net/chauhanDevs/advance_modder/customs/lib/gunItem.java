package net.chauhanDevs.advance_modder.customs.lib;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.chauhanDevs.advance_modder.client.keyBindingsInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class gunItem{

    public static CompoundNBT nbtG;
    public static int tB;
    public static void use(PlayerEntity playerIn, Hand handIn, int totalBullets) {
        tB = totalBullets;
        ItemStack stack = playerIn.getItemInHand(handIn);
        CompoundNBT nbt;
        if (stack.hasTag()) {
            nbt = stack.getTag();
        } else {
            nbt = new CompoundNBT();
        }
        assert nbt != null;
        nbtG = nbt;
        if(nbt.getInt("bullets") > 0){
            nbt.putInt("bullets", nbt.getInt("bullets") - 1);
            playerIn.displayClientMessage(new StringTextComponent("Bullets Left:" + totalBullets + "/" + nbt.getInt("bullets")),true);
            stack.setTag(nbt);
        }else if(nbt.getInt("bullets") == 0){
            playerIn.displayClientMessage(new StringTextComponent("\u00A74 Bullets Finished! Reload The Gun!"), true);
        }
        stack.setTag(nbt);

    }
    public static void appendHoverText(ItemStack item, List<ITextComponent> tooltip,
                                       int totalBullets) {
        String bullets = Integer.toString(totalBullets);
        CompoundNBT nbt = item.getTag();
        tooltip.add(new TranslationTextComponent("tooltip." + advance_gun_mod.ID + ".press.g"));
        String result = null;
        if (nbt != null) {
            result = Integer.toString(nbt.getInt("bullets"));
        }else{
            result =  "0";
        }
        tooltip.add(new StringTextComponent(bullets + "/" + result));
        item.setTag(nbt);
    }
    @SubscribeEvent
    public static void reload(ClientTickEvent event){
        if (keyBindingsInit.reload.isDown()) {
            nbtG.putInt("bullets", tB);
        }
    }
}
