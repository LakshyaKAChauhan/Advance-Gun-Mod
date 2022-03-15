package net.chauhanDevs.advance_modder.core.init;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class VillagerProfessions {/*
    public static final DeferredRegister<VillagerProfession> V_PROFESSION = DeferredRegister.create(ForgeRegistries.PROFESSIONS,
            advance_gun_mod.ID);

    public static final RegistryObject<VillagerProfession> GUN_WORKER = V_PROFESSION.register("gun_worker",
            () -> new VillagerProfession("gun_worker",
                    VillagerProfessionBlock.GUN_WORKER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    //Trades
    /*public static void setGunWorkerProf(){
        VillagerTrades.ITrade[] lvl1 = new VillagerTrades.ITrade[]{new VillagerTrades.EmeraldForItemsTrade(Items.OBSIDIAN, 12, 5, 12)};
        VillagerTrades.ITrade[] lvl2 = new VillagerTrades.ITrade[]{new VillagerTrades.EmeraldForItemsTrade(Items.DIAMOND_BLOCK, 12, 5, 12),
        new VillagerTrades.EmeraldForItemsTrade(Items.GOLD_INGOT, 12, 5, 12)};
        VillagerTrades.ITrade[] lvl3 = new VillagerTrades.ITrade[]{};
        VillagerTrades.ITrade[] lvl4 = new VillagerTrades.ITrade[]{};
        VillagerTrades.ITrade[] lvl5 = new VillagerTrades.ITrade[]{};
        VillagerTrades.TRADES.put(GUN_WORKER.get(), toIntMap(ImmutableMap.of(1, lvl1, 2, lvl2, 3, lvl3,
                4, lvl4, 5, lvl5)));

    }
    public static Int2ObjectMap<VillagerTrades.ITrade[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ITrade[]> p_221238_0_) {
        return new Int2ObjectOpenHashMap<>(p_221238_0_);
    }
    public static class MultiItemsForEmeraldTrade implements VillagerTrades.ITrade{
        public final List<Item> item;
        public final List<Integer> amountOfItem;
        public final List<Integer> amountOfEmeralds;
        public final int uses;
        public final int villagerExp;

        public MultiItemsForEmeraldTrade(List<Item> item, List<Integer> amountOfItem, List<Integer> amountOfEmeralds, int uses, int villagerExp){
            this.item = item;
            this.amountOfItem = amountOfItem;
            this.amountOfEmeralds = amountOfEmeralds;
            this.uses = uses;
            this.villagerExp = villagerExp;
        }
        @Nullable
        @Override
        public MerchantOffer getOffer(Entity entity, Random random){
            int choose = random.nextInt() * item.size();
            return null;
        }
    }
*/
}
