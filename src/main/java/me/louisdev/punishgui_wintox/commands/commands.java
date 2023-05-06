package me.louisdev.punishgui_wintox.commands;

import me.louisdev.punishgui_wintox.manager.FirstGui;
import org.bukkit.command.CommandExecutor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class commands implements CommandExecutor {



    private static String playername;
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cJe bent geen speler!"));
            return false;
        }
        if (!sender.hasPermission("staff.punish"))
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cJe hebt niet de juiste rechten!"));
        Player player = (Player)sender;
        if (args.length == 0) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cJe hebt geen naam opgegeven"));
            return false;
        }

        playername = args[0];

        if(playername == player.getName() || playername == player.getDisplayName())
            player.sendMessage(ChatColor.RED + "Je kunt je eigen niet punsihen");

        OfflinePlayer offlinePlayer = Bukkit.getServer().getOfflinePlayer(playername);
        if (!offlinePlayer.hasPlayedBefore()) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cKan deze speler niet vinden. Kijk of je de naam juist hebt geschreven."));
            return false;
        }

        new FirstGui(player);

        return false;
    }

    public static String getPlayername() {
        return playername;
    }
}
