package me.nerfin.rainbowsheep;

import me.nerfin.rainbowsheep.events.SpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("RainbowSheep 1.0 created by NerFin");
        Bukkit.getPluginManager().registerEvents(new SpawnEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
