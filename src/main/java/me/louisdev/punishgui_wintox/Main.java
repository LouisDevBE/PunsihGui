package me.louisdev.punishgui_wintox;

import me.louisdev.punishgui_wintox.Events.bans;
import me.louisdev.punishgui_wintox.Events.events;
import me.louisdev.punishgui_wintox.commands.commands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main main;
    @Override
    public void onEnable() {
        main = this;

        getCommand("pu").setExecutor(new commands());
        Bukkit.getPluginManager().registerEvents(new events(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents(new bans(), (Plugin)this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getMain() {
        return main;
    }
}
