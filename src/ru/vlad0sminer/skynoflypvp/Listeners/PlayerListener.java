package ru.vlad0sminer.skynoflypvp.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerListener implements Listener {

    @EventHandler
    private void onPvPWithFly(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            if (e.getEntity() instanceof Player) {
                if (((Player) e.getEntity()).getGameMode() != GameMode.CREATIVE) {
                    if (((((Player) e.getDamager()).isFlying()) || (((Player) e.getDamager()).getGameMode() == GameMode.CREATIVE)) && !e.getDamager().isOp()) {
                        e.getDamager().sendMessage(ChatColor.RED + "[Protect] " + ChatColor.WHITE + "PVP во флае или креативе запрещено!");
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
