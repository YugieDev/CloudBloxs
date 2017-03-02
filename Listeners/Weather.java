package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;


public class Weather implements Listener{

    public static Main plugin;

    public Weather (Main main)
    {
        plugin = main;
    }

    @EventHandler(priority= EventPriority.HIGHEST, ignoreCancelled = true)
    public void onWeatherChangeEvent(WeatherChangeEvent event){
        event.setCancelled(true);
    }

}
