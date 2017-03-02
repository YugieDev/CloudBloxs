package com.yugiedev.Cloud;

import Commands.*;
import Listeners.*;
import Listeners.Spawn;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Item;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin implements Listener {

    //Core\\
    public Core CoreActions;
    //Listeners\\
    public Block Blocks;
    public Fall FallDamage;
    public Fire FireDamage;
    public ItemJoin JoinItems;
    public Hand Switch;
    public Food Hunger;
    public Spawn SpawnJoin;
    public Weather Rain;
    //Commands\\
    private Links CMDLinks;
    private Core CMDCore;
    public static Plugin plugin;
    ConsoleCommandSender console = getServer().getConsoleSender();
    public final Logger logger = Logger.getLogger("Minecraft");

    public void onEnable() {
        this.CoreActions = new Core(this);
        this.Blocks = new Block(this);
        this.FallDamage = new Fall(this);
        this.FireDamage = new Fire(this);
        this.JoinItems = new ItemJoin(this);
        this.Switch = new Hand(this);
        this.Hunger = new Food(this);
        this.SpawnJoin = new Spawn(this);
        this.Rain = new Weather(this);
        this.CMDLinks = new Links(this);
        this.CMDCore = new Core(this);
        getCommand("Website").setExecutor(this.CMDLinks);
        getCommand("Twitter").setExecutor(this.CMDLinks);
        getCommand("Store").setExecutor(this.CMDLinks);
        getCommand("Links").setExecutor(this.CMDCore);
        getCommand("Vote").setExecutor(this.CMDCore);
        getCommand("Staff").setExecutor(this.CMDCore);
        getCommand("gmc").setExecutor(this.CMDCore);
        getCommand("gms").setExecutor(this.CMDCore);
        getCommand("gma").setExecutor(this.CMDCore);
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.CoreActions, this);
        pm.registerEvents(this.Blocks, this);
        pm.registerEvents(this.FallDamage, this);
        pm.registerEvents(this.FireDamage, this);
        pm.registerEvents(this.JoinItems, this);
        pm.registerEvents(this.Switch, this);
        pm.registerEvents(this.Hunger, this);
        pm.registerEvents(this.SpawnJoin, this);
        pm.registerEvents(this.Rain, this);
        saveDefaultConfig();
    }

    public void onDisable() {
        getLogger().info("Hub has been disabled");
    }






}