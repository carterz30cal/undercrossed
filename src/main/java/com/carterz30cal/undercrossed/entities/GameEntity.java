package com.carterz30cal.undercrossed.entities;

import java.util.UUID;
public class GameEntity {
    private final UUID uuid;

    public GameEntity() {
        uuid = UUID.randomUUID();
    }

    /**
     * @return The UUID of this entity.
     **/
    public UUID getUniqueId() {
        return uuid;
    }

}
