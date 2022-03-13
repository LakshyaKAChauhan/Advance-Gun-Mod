package net.chauhanDevs.advance_gun_mod;

import net.chauhanDevs.advance_gun_mod.core.init.VillagerProfessionBlock;
import net.chauhanDevs.advance_gun_mod.core.init.VillagerProfessions;
import net.chauhanDevs.advance_gun_mod.core.init.blocks;
import net.chauhanDevs.advance_gun_mod.core.init.items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(advance_gun_mod.ID)
public class advance_gun_mod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ID = "advance_gun_mod";
    public advance_gun_mod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        blocks.BLOCKS.register(bus);
        items.ITEMS.register(bus);
        VillagerProfessionBlock.V_PROFESSION_B.register(bus);
        VillagerProfessions.V_PROFESSION.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        //VillagerProfessionBlock.registerPoi();
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
