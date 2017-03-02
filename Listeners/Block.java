package Listeners;

import com.yugiedev.Cloud.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;

public class Block implements Listener{

    public static Main plugin;

    public Block (Main main)
    {
        plugin = main;
    }

    @EventHandler(priority= EventPriority.HIGHEST)
    public void onBlockExplode(BlockExplodeEvent event){
            event.setCancelled(true);
        }
    public void onBlockGrow(BlockGrowEvent event){
            event.setCancelled(true);
        }
    public void onBlockIgnite(BlockIgniteEvent event){
            event.setCancelled(true);
        }

    }
