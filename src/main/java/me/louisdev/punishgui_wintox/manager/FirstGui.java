package me.louisdev.punishgui_wintox.manager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FirstGui {
    public FirstGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&cPunishgui"));

        //ilegal mods
        ItemStack item = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #1 Use of illegal clients or mods"));
        item.setItemMeta(meta);
        inv.setItem(10, item);

        //trolling

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #2 Trolling"));
        item.setItemMeta(meta);
        inv.setItem(11, item);


        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #3 Bug abuse"));
        item.setItemMeta(meta);
        inv.setItem(12, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #4 Swearing"));
        item.setItemMeta(meta);
        inv.setItem(13, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #5 Hate speech"));
        item.setItemMeta(meta);
        inv.setItem(14, item);


        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #6 Spamming"));
        item.setItemMeta(meta);
        inv.setItem(15, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #7 Impersonation"));
        item.setItemMeta(meta);
        inv.setItem(16, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #8 Scamming"));
        item.setItemMeta(meta);
        inv.setItem(19, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #9 Advertising"));
        item.setItemMeta(meta);
        inv.setItem(20, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #10 Threaten server"));
        item.setItemMeta(meta);
        inv.setItem(21, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #11 Inappropiate buildings and signs"));
        item.setItemMeta(meta);
        inv.setItem(22, item);

        item = new ItemStack(Material.REDSTONE_BLOCK);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRule #12 Inappropiate behavoir"));
        item.setItemMeta(meta);
        inv.setItem(23, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cClose"));
        item.setItemMeta(meta);
        inv.setItem(50, item);


        guiBorder.guiborder(inv);
        player.openInventory(inv);
    }
}
