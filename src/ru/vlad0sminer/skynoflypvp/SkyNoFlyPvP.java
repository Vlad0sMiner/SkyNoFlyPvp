package ru.vlad0sminer.skynoflypvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.vlad0sminer.skynoflypvp.Listeners.PlayerListener;

public class SkyNoFlyPvP extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
        Bukkit.getLogger().info("Плагин включен!");
    }


    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Плагин выключен!");
    }

}
