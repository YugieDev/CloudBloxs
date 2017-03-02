package Commands;

import com.yugiedev.Cloud.Main;
import me.clip.actionannouncer.ActionAnnouncer;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.io.File;

public class Core  implements Listener, CommandExecutor {
    public File configFile = null;
    public static Main plugin;

    public Core (Main main) {
        plugin = main;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("links")) {
            sender.sendMessage("");
            sender.sendMessage("§e§lTwitter §7┃ §bhttps://twitter.com/CloudBloxs");
            sender.sendMessage("§e§lYouTube §7┃ §bhttps://youtube.com/c/CloudBloxs");
            sender.sendMessage("§e§lPMC §7┃ §bhttps://planetminecraft.com");
            sender.sendMessage("");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("vote")) {
            sender.sendMessage("");
            sender.sendMessage("§eVote §b1 §7┃ §awww.google.com");
            sender.sendMessage("§eVote §b2 §7┃ §awww.google.com");
            sender.sendMessage("§eVote §b2 §7┃ §awww.google.com");
            sender.sendMessage("");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("staff")) {
            sender.sendMessage("");
            sender.sendMessage("§7[§eOwner§7] §eYugie");
            sender.sendMessage("§7[§cDev§7] §cYugie §7┃ §cExtended_Clip");
            sender.sendMessage("§7[§cAdmin§7] §cTheLazyPeanut §7┃ §cPandaBooty");
            sender.sendMessage("§7[§dMod§7] §dPlayerName §7┃ §dPlayerName");
            sender.sendMessage("");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("twitter")) {
            sender.sendMessage("");
            sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §ewww.twitter.com/cloudbloxs");
            sender.sendMessage("");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("gmc")) {
            if (sender.hasPermission("cloudbloxs.gamemode")) {
                ((Player) sender).setGameMode(GameMode.CREATIVE);
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §bYour gamemode has been set to §eCreative");
                return true;
            }
            else {
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §cYou do not have permission for this command");
            }
        }
        if (cmd.getName().equalsIgnoreCase("gms")) {
            if (sender.hasPermission("cloudbloxs.gamemode")) {
                ((Player) sender).setGameMode(GameMode.SURVIVAL);
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §bYour gamemode has been set to §eSurvival");
                return true;
            }
            else {
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §cYou do not have permission for this command");
            }
        }
        if (cmd.getName().equalsIgnoreCase("gma")) {
            if (sender.hasPermission("cloudbloxs.gamemode")) {
                ((Player) sender).setGameMode(GameMode.ADVENTURE);
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §bYour gamemode has been set to §eAdventure");
                ActionAnnouncer.sendAnnouncement(p, "HELLO");
                return true;
            }
            else {
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §cYou do not have permission for this command");
            }
        }
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        if (cmd.getName().equalsIgnoreCase("ram")) {
            if (sender.hasPermission("cloudbloxs.moderator")) {
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §bYour gamemode has been set to §eAdventure");
                return true;
            }
            else {
                sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §cYou do not have permission for this command");
            }
        }
        return true;
    }

}