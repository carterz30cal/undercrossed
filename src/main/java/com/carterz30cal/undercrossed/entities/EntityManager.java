package com.carterz30cal.undercrossed.entities;

import com.carterz30cal.undercrossed.Undercrossed;
import com.carterz30cal.undercrossed.entities.pulses.GameHeartbeat;
import org.bukkit.NamespacedKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * Handles basic functionality for all entities within the game world.
 * More complicated functionality is handled by specific Managers, such
 * as the PlayerManager.
 *
 */
public class EntityManager {
    public static final NamespacedKey keyEntity = new NamespacedKey(Undercrossed.instance, "keyEntity");
    private static final HashMap<UUID, GameEntity> entities = new HashMap<>();
    private static final ArrayList<GameHeartbeat> heartbeats = new ArrayList<>();

    public static void registerEntity(GameEntity entity) {
        UUID uuid = entity.getUniqueId();

        entities.put(uuid, entity);
    }
}
