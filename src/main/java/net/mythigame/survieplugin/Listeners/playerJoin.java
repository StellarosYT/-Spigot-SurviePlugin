package net.mythigame.survieplugin.Listeners;
import net.mythigame.commons.Account;
import net.mythigame.commons.RankUnit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class playerJoin implements Listener {

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        Player player = event.getPlayer();

        player.setAllowFlight(false);
        player.setFlying(false);
        player.setGameMode(GameMode.SURVIVAL);
        player.setCollidable(false);
        player.setArrowsInBody(0);
        player.setVisualFire(false);
        player.setInvulnerable(false);

        Account account = new Account().getAccount(player.getUniqueId());
        if(account != null){
            if(account.getGrade().getPower() <= RankUnit.JOUEUR.getPower()){
                event.setJoinMessage("§7[§2+§7] " + player.getDisplayName());
            }else{
                event.setJoinMessage("§7[§2+§7] " + account.getGrade().getPrefix() + player.getDisplayName());
            }
        }else event.setJoinMessage(null);
    }

}
