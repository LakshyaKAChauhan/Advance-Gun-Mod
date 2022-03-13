package net.chauhanDevs.advance_gun_mod.common.event;


import net.chauhanDevs.advance_gun_mod.advance_gun_mod;
import net.chauhanDevs.advance_gun_mod.core.init.VillagerProfessionBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = advance_gun_mod.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class commonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event){
        VillagerProfessionBlock.registerPoi();
    }
}
