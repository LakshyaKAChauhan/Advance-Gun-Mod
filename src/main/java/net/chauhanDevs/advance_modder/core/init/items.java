package net.chauhanDevs.advance_modder.core.init;

import net.chauhanDevs.advance_modder.advance_gun_mod;
//import net.chauhanDevs.advance_modder.common.items.guns.AK_47;
import net.chauhanDevs.advance_modder.common.items.guns.TestChauhan;
import net.chauhanDevs.advance_modder.common.items.guns.gun;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            advance_gun_mod.ID);

    //Gun's Holder Register
    public static final RegistryObject<Item> ak_47_holder_oak = ITEMS.register("ak_47_holder_oak",
            () -> new Item(new Item.Properties().tab(Tabs.GUNS)));
    public static final RegistryObject<Item> ak_47_holder_dark_oak = ITEMS.register("ak_47_holder_dark_oak",
            () -> new Item(new Item.Properties().tab(Tabs.GUNS)));
    public static final RegistryObject<Item> ak_47_holder_birch = ITEMS.register("ak_47_holder_birch",
            () -> new Item(new Item.Properties().tab(Tabs.GUNS)));
    public static final RegistryObject<Item> ak_47_holder_spurce = ITEMS.register("ak_47_holder_spurce",
            () -> new Item(new Item.Properties().tab(Tabs.GUNS)));

    //Guns Register
    public static final RegistryObject<gun> ak_47_holder_none = ITEMS.register("ak_47_holder_none",
            () -> new gun(new gun.Properties().stacksTo(1)));


    //Blocks Register
    public static final RegistryObject<BlockItem> G_WORKBENCH = ITEMS.register("a",
            () -> new BlockItem(blocks.G_WORKBENCH.get(), new Item.Properties().tab(Tabs.BLOCKS)));

    //Test Up
    public static final RegistryObject<TestChauhan> TESTCHAUHAN = ITEMS.register("test_chauhan",
            () -> new TestChauhan(new TestChauhan.Properties().tab(Tabs.GUNS)));
}
