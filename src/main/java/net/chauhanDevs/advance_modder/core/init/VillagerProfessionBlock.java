package net.chauhanDevs.advance_modder.core.init;

import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.InvocationTargetException;

public class VillagerProfessionBlock {
   /*public static final DeferredRegister<PointOfInterestType> V_PROFESSION_B = DeferredRegister.create(ForgeRegistries.POI_TYPES,
            advance_gun_mod.ID);

    public static final RegistryObject<PointOfInterestType> GUN_WORKER_POI = V_PROFESSION_B.register("gun_worker_poi",
            () -> new PointOfInterestType("gun_worker_poi",
                    PointOfInterestType.getBlockStates(blocks.G_WORKBENCH.get()),
                    1, 1));
    public static void registerPoi(){
        try {
            ObfuscationReflectionHelper.findMethod(PointOfInterestType.class,
                    "registerBlockStates", PointOfInterestType.class).invoke(null,
                    GUN_WORKER_POI.get());
        }catch (IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }*/
}
