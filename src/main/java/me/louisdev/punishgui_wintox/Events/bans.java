package me.louisdev.punishgui_wintox.Events;

import me.louisdev.punishgui_wintox.commands.commands;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class bans implements Listener {

        private String playerName;


        public String getPlayerName () {
            return this.playerName;
        }

        @EventHandler(priority = EventPriority.MONITOR)
        public void guiClickEvent (InventoryClickEvent event){
            if (!event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&cPunishguibans")))
                return;
            if (event.getCurrentItem() == null)
                return;
            Player player = Bukkit.getPlayer(commands.getPlayername());;

            ItemStack is = event.getCurrentItem();


            if (is == null)
                return;
            if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName()  + " #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " 1d #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c15d ban #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " 15d #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " 30d #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #1"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " #1 Use of illegal clients or mods");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #2"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #2 Teaming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #3"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #3 Trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #4"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #4 Camping");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #5"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #5 Bug abuse");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c2d mute #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 2d #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d mute #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 7d #6 Swearing");
                player.closeInventory();

            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #6"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #6 Swearing");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c15d ban #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 15d #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #7"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #7 Hate speech");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c15d mute #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 15d #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #8"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #8 Threats");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d 9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c3d mute #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 3d #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d mute #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 7d #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #9"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #9 Chat trolling");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d mute #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 7d #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #10"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #10 Spamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d mute #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 7d #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #11"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #11 Impersonation");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c15d mute #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 15d #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #12"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #12 Scamming");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d mute #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 1d #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d mute #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 7d #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d mute #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempmute " + player.getName() + " --sender=staffteam 30d #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #13"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "mute " + player.getName() + " --sender=staffteam #13 Advertising");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #14"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #14 Threaten server");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #14"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #14 Threaten server");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c15d ban #14"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 15d #14 Threaten server");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #14"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #14 Threaten server");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #14"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #14 Threaten server");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 7d #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 30d #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #15"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "ban " + player.getName() + " --sender=staffteam #15 Inappropiate buildings and signs");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cWarn #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "warn " + player.getName() + " --sender=staffteam #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cKick #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "kick " + player.getName() + " --sender=staffteam #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c1d ban #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam 1d #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c7d ban #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&c30d ban #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #16"))) {
                Bukkit.dispatchCommand((CommandSender) Bukkit.getConsoleSender(), "tempban " + player.getName() + " --sender=staffteam #16 Inappropiate behavoir");
                player.closeInventory();
            } else if (is.getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&cBack"))) {
                player.closeInventory();
            }
            event.setCancelled(true);
        }
    }

