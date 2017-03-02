package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Fire implements Listener{

    public static Main plugin;

    public Fire (Main main)
    {
        plugin = main;
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void onEntityDamage(EntityDamageEvent event){
        if (event.getCause() == EntityDamageEvent.DamageCause.FIRE){
            event.setCancelled(true);
        }
        if (event.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK){
            event.setCancelled(true);
        }
        if (event.getCause() == EntityDamageEvent.DamageCause.HOT_FLOOR){
            event.setCancelled(true);
        }
        if (event.getCause() == EntityDamageEvent.DamageCause.LAVA){
            event.setCancelled(true);
        }
    }

}
