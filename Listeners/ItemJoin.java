package Listeners;

import java.util.ArrayList;

import com.yugiedev.Cloud.Main;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemJoin implements Listener{

    public static Chat chat = null;

    public static Main plugin;

    public ItemJoin(Main main)
    {
        plugin = main;
    }

    @EventHandler
    public void invDrag(InventoryDragEvent event)
    {
        Player player = (Player)event.getWhoClicked();
        event.setCancelled(true);
            player.updateInventory();
    }

    @EventHandler
    public void ItemDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);
            player.updateInventory();
    }

    public static void giveplayerhead(Player p)
    {
        ArrayList<String> Lore = new ArrayList();
        Lore.add("sda");

        Integer Amount = Integer.valueOf(1);
        Integer Slot = Integer.valueOf(4);

        ItemStack PlayerHead = new ItemStack(Material.SKULL_ITEM);
        PlayerHead.setDurability((short)3);
        PlayerHead.setAmount(Amount.intValue());
        SkullMeta PlayerHeadMeta = (SkullMeta)PlayerHead.getItemMeta();

        PlayerHeadMeta.setDisplayName("§e" + p.getName() + " §bProfile");
        PlayerHeadMeta.setLore(Lore);
        PlayerHeadMeta.setOwner(p.getName());

        PlayerHead.setItemMeta(PlayerHeadMeta);
        p.getInventory().setItem(Slot.intValue(), PlayerHead);
        p.updateInventory();
    }

    public static void compass(Player p)
    {
        ArrayList<String> Lore = new ArrayList();
        Lore.add("§7Select the server");
        Lore.add("§7that you want to go to");

        Integer Amount = Integer.valueOf(1);
        Integer Slot = Integer.valueOf(4);

        ItemStack Compass = new ItemStack(Material.COMPASS);
        ItemMeta ItemMeta = Compass.getItemMeta();

        ItemMeta.setDisplayName("§eServer Selector §7(Right Click)");
        ItemMeta.setLore(Lore);

        Compass.setItemMeta(ItemMeta);
        p.getInventory().setItem(Slot.intValue(), Compass);
        p.updateInventory();
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        compass(player);
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onClickEvent(PlayerInteractEvent event) {
        if (event.getAction()== Action.RIGHT_CLICK_AIR || event.getAction()== Action.RIGHT_CLICK_BLOCK || event.getAction()== Action.LEFT_CLICK_AIR || event.getAction()== Action.LEFT_CLICK_BLOCK) {
            final ItemStack currentItem = event.getPlayer().getItemInHand();
            if (currentItem.getItemMeta().getDisplayName() == "§eServer Selector §7(Right Click)") ;{
                Player player = event.getPlayer();
                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                String command = "dm open server " + event.getPlayer().getName();
                Bukkit.dispatchCommand(console, command);
            }
            if (currentItem.getItemMeta() == null){
            }
        }
    }
}


