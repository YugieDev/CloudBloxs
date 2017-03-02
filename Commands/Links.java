package Commands;

import java.io.File;
import com.yugiedev.Cloud.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Links implements Listener, CommandExecutor {
    public File configFile = null;
    public static Main plugin;

    public Links(Main main) {
        plugin = main;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("website")) {
            sender.sendMessage("");
            sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §ewww.cloudbloxs.net");
            sender.sendMessage("");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("store")) {
            sender.sendMessage("");
            sender.sendMessage("§b§lCloud§e§lBloxs §7┃ §ewww.store.cloudbloxs.net");
            sender.sendMessage("");
            return true;
        }
        return true;
    }

}
