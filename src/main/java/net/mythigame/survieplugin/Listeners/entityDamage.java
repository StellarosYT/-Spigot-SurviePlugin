package net.mythigame.survieplugin.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class entityDamage implements Listener {

    @EventHandler
    public void protectCrops(PlayerInteractEvent event){
        if(event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType() == Material.FARMLAND)
            event.setCancelled(true);
    }

}
