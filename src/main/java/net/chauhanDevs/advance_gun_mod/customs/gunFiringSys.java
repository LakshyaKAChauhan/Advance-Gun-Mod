package net.chauhanDevs.advance_gun_mod.customs;

import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class gunFiringSys extends Item {

    public gunFiringSys(Properties properties) {
        super(properties);
    }

    public static void gunFiringSys(World world, PlayerEntity playerIn){
        double x = playerIn.getX(), y = playerIn.getY(), z = playerIn.getZ();
        ZombieEntity ammom = new ZombieEntity(world);
        ammom.setPos(x, y, z);
        float rotY = playerIn.yHeadRot;
        ammom.setYHeadRot(rotY);
        ammom.setYBodyRot(rotY);
        playerIn.setYBodyRot(rotY);
        //world.addFreshEntity(ammom);
    }
}
