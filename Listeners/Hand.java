package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class Hand implements Listener {

    public static Main plugin;

    public Hand(Main main) {
        plugin = main;
    }

    @EventHandler
    public void onSwitch(PlayerSwapHandItemsEvent event) {
        event.setCancelled(true);
    }
}