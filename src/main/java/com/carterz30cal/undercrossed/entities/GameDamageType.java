package com.carterz30cal.undercrossed.entities;

import org.bukkit.ChatColor;

public enum GameDamageType {
    PHYSICAL("Physical", "\u271C", ChatColor.WHITE);
    private final String name;
    private final String icon;
    private final ChatColor colour;

    GameDamageType(String name, String icon, ChatColor colour) {
        this.name = name;
        this.icon = icon;
        this.colour = colour;
    }
}
