package me.louisdev.punishgui_wintox.manager;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SecondGui {
    public SecondGui(Integer id, Player player, Inventory inv) {
        if (id == 1) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #1"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #1"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #1"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c15d ban #1"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #1"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #1"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
            item = new ItemStack(Material.BARRIER);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
            item.setItemMeta(meta);
            inv.setItem(49, item);
        } else if (id == 2) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #2"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #2"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #2"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d ban #2"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #2"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #2"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 3) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #3"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #3"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #3"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d ban #3"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #3"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #3"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 4) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #6"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #6"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c2d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(13, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(22, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #6"));
            item.setItemMeta(meta);
            inv.setItem(31, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #6"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo perm ban"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 5) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #6"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #6"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c2d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(13, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(22, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #6"));
            item.setItemMeta(meta);
            inv.setItem(31, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #6"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo perm ban"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 6) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #6"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #6"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c2d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(13, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d mute #6"));
            item.setItemMeta(meta);
            inv.setItem(22, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #6"));
            item.setItemMeta(meta);
            inv.setItem(31, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #6"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo perm ban"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 7) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #7"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #7"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d mute #7"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c15d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(33, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #7"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 8) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #7"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #7"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d mute #7"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c15d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #7"));
            item.setItemMeta(meta);
            inv.setItem(33, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #7"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 9) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #9"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #9"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d mute #9"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c3d mute #8"));
            item.setItemMeta(meta);
            inv.setItem(13, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d mute #8"));
            item.setItemMeta(meta);
            inv.setItem(22, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d mute #8"));
            item.setItemMeta(meta);
            inv.setItem(31, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm mute #8"));
            item.setItemMeta(meta);
            inv.setItem(40, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo ban"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo perm ban"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 10) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #14"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #14"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c15d ban #14"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #14"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #14"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 11) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #14"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #14"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c15d ban #14"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #14"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #14"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        } else if (id == 12) {
            player.openInventory(inv);
            ItemStack item = new ItemStack(Material.BOOK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cWarn #16"));
            item.setItemMeta(meta);
            inv.setItem(0, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cKick #16"));
            item.setItemMeta(meta);
            inv.setItem(2, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&fNo mute"));
            item.setItemMeta(meta);
            inv.setItem(4, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c1d ban #16"));
            item.setItemMeta(meta);
            inv.setItem(6, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c7d ban #16"));
            item.setItemMeta(meta);
            inv.setItem(15, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c30d ban #16"));
            item.setItemMeta(meta);
            inv.setItem(24, item);
            item = new ItemStack(Material.BOOK);
            meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cPerm ban #16"));
            item.setItemMeta(meta);
            inv.setItem(8, item);
        }
    }
}