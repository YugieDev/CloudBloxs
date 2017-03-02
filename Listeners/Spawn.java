package Listeners;

import com.yugiedev.Cloud.Main;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPortalEvent;


public class Spawn implements Listener {

    public static Chat chat = null;

    public static Main plugin;

    public Spawn(Main main)
    {
        plugin = main;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        Location spawn = p.getWorld().getSpawnLocation().add(0.5D, 1.0D, 0.5D);
        p.teleport(spawn);
        p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.5f, 0.0f);
    }

    @EventHandler
    public void onVoidFall(EntityDamageEvent event){
        if ((event.getEntity() instanceof Player)){
            Player p = (Player)event.getEntity();
            event.setCancelled(true);
            if (event.getCause() == EntityDamageEvent.DamageCause.VOID){
                Location spawn = p.getWorld().getSpawnLocation().add(0.5D, 1.0D, 0.5D);
                p.teleport(spawn);
                p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.5f, 0.0f);
            }
        }
    }

    @EventHandler
    public void onVoidEqualsY(PlayerMoveEvent event){
        if (event.getPlayer().getLocation().getY() == 60);
        Player p = event.getPlayer();
        Location spawn = p.getWorld().getSpawnLocation().add(0.5D, 1.0D, 0.5D);
        p.teleport(spawn);
        p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.5f, 0.0f);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event)
    {
        if (event.getTo().getBlock().isLiquid())
        {
            Player p = event.getPlayer();
            Location spawn = p.getWorld().getSpawnLocation().add(0.5D, 1.0D, 0.5D);
            p.teleport(spawn);
            p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.5F, 0.0F);
        }
    }

    @EventHandler
    public void onPortalEnter(PlayerPortalEvent e) {
        Player p = e.getPlayer();
        Location portal = p.getLocation().add(0.D, 0.0D, -2.D);
        p.teleport(portal);
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        String command = "dm open server " + e.getPlayer().getName();
        Bukkit.dispatchCommand(console, command);
    }
}
