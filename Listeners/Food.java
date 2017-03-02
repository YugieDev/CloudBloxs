package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Food implements Listener {

    public static Main plugin;

    public Food(Main main)
    {
        plugin = main; 
    }

    @EventHandler
    public void onFoodChange(FoodLevelChangeEvent event){
        event.setCancelled(true);
        event.setFoodLevel(20);
    }

}
