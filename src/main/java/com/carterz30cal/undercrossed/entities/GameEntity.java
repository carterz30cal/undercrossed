package com.carterz30cal.undercrossed.entities;

import com.carterz30cal.undercrossed.entities.pulses.GameHeartbeat;

import java.util.UUID;
public class GameEntity {
    private final UUID uuid;
    private GameHeartbeat heartbeat;

    public GameEntity() {
        uuid = UUID.randomUUID();
    }

    /**
     * @return The UUID of this entity.
     **/
    public UUID getUniqueId() {
        return uuid;
    }

    /**
     *
     * @return The active GameHeartbeat of this entity, which determines when it is allowed to stay alive, and when it must die.
     */
    public GameHeartbeat getHeartbeat() {
        return heartbeat;
    }

}
