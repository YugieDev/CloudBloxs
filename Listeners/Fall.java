package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Fall implements Listener{

    public static Main plugin;

    public Fall(Main main)
    {
        plugin = main;
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void onEntityDamage(EntityDamageEvent event){
        if (event.getCause() == EntityDamageEvent.DamageCause.FALL){
            event.setCancelled(true);
        }
    }

}
