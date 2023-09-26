package com.carterz30cal.undercrossed.entities.pulses;

import com.carterz30cal.undercrossed.entities.GameEntity;

public class GameHeartbeat {
    private final GameEntity owner;

    public GameHeartbeat(GameEntity owner) {
        this.owner = owner;
    }

    public void stop() {

    }
}
