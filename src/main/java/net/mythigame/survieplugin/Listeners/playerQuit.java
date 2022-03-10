package net.mythigame.survieplugin.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerQuit implements Listener {

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event){
        final Player player = event.getPlayer();
        event.setQuitMessage("§7[§c-§7] " + player.getName());
    }

}
