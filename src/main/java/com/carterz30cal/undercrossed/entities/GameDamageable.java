package com.carterz30cal.undercrossed.entities;

import java.util.EnumMap;
import java.util.Map;

public class GameDamageable extends GameEntity {
    private long health;
    private Map<GameDamageType, Integer> resistances = new EnumMap<>(GameDamageType.class);

    /** Allows for safe access to the health of the entity. */
    public long getHealth() {
        return health;
    }

    /** Get the resistance to a specific type of damage for this entity.
     * @param damageType What resistance are we checking?
     * @return A positive resistance integer.
     * */
    public int getResistance(GameDamageType damageType) {
        return resistances.getOrDefault(damageType, 0);
    }


}
