package net.chauhanDevs.advance_modder.core.init;


import net.chauhanDevs.advance_modder.advance_gun_mod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            advance_gun_mod.ID);

    public static final RegistryObject<Block> G_WORKBENCH = BLOCKS.register("a",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(2f, 2f)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
}
