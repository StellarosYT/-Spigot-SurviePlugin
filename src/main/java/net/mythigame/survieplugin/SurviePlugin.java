package net.mythigame.survieplugin;

import net.mythigame.commons.Storage.Redis.RedisAccess;
import net.mythigame.survieplugin.Listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurviePlugin extends JavaPlugin {

    private static SurviePlugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        System.out.println("[SurviePlugin] Le plugin a bien démarré.");
        Bukkit.setDefaultGameMode(GameMode.ADVENTURE);
        registerEvents();
        RedisAccess.init();
    }

    @Override
    public void onDisable() {
        System.out.println("[SurviePlugin] Le plugin a bien été arrêté.");
        RedisAccess.close();
    }

    public static SurviePlugin getInstance() {
        return INSTANCE;
    }

    private void registerEvents(){
        PluginManager pluginManager = Bukkit.getServer().getPluginManager();
        pluginManager.registerEvents(new entityDamage(), this);
        pluginManager.registerEvents(new playerChat(), this);
        pluginManager.registerEvents(new playerJoin(), this);
        pluginManager.registerEvents(new playerQuit(), this);
    }
}
