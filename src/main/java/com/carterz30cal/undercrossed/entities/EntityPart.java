package com.carterz30cal.undercrossed.entities;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.persistence.PersistentDataType;

/**
 * This is an additional layer of abstraction over bukkit entities.
 * The EntityPart class will handle various operations in the game world
 * that differ depending on underlying type, which would get tedious if
 * we had to manage manually.
 * @version 1.0.0
 * @author carterz30cal
 */
public class EntityPart {
    private Entity bukkitEntity;
    private GameEntity pluginEntity;

    public void registerPart() {
        bukkitEntity.getPersistentDataContainer().set(
                EntityManager.keyEntity,
                PersistentDataType.STRING,
                pluginEntity.getUniqueId().toString());

    }

    public void kill() {
        if (bukkitEntity instanceof LivingEntity) {
            LivingEntity livingVariant = (LivingEntity) bukkitEntity;

            livingVariant.setHealth(0);
        }
        else remove();
    }

    public void remove() {
        bukkitEntity.remove();
    }



}
