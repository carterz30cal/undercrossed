package com.carterz30cal.undercrossed;

import com.carterz30cal.undercrossed.entities.EntityManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is the entry point for the Undercrossed Minecraft Plugin.
 * This class handles very little, in terms of actual logic, and mostly
 * just creates managers/factories/builders which then deal with the
 * delegated logic.
 * @author carterz30cal
 */
public final class Undercrossed extends JavaPlugin {
    public static Undercrossed instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
