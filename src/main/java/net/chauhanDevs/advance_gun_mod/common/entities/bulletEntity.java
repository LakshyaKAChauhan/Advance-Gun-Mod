package net.chauhanDevs.advance_gun_mod.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AmbientEntity;
import net.minecraft.world.World;

public class bulletEntity extends AmbientEntity {
    public bulletEntity(EntityType<AmbientEntity> entity, World world) {
        super(entity, world);
    }
}
