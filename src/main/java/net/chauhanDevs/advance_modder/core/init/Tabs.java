package net.chauhanDevs.advance_modder.core.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public abstract class Tabs extends ItemGroup {

    public static final Tabs GUNS = new Tabs(ItemGroup.TABS.length, "guns"){
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(items.ak_47_holder_none.get());
        }
    };
    public static final Tabs BLOCKS = new Tabs(ItemGroup.TABS.length, "blocks"){
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon(){return new ItemStack(items.G_WORKBENCH.get());}
    };


    public Tabs(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }
}
