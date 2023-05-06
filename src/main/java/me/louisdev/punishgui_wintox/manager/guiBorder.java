package me.louisdev.punishgui_wintox.manager;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class guiBorder {
    public static void guiborder(Inventory inv) {

        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        inv.setItem(0, item);
        inv.setItem(1, item);
        inv.setItem(2, item);
        inv.setItem(3, item);
        inv.setItem(4, item);
        inv.setItem(5, item);
        inv.setItem(6, item);
        inv.setItem(7, item);
        inv.setItem(8, item);
        inv.setItem(9, item);
        inv.setItem(17, item);
        inv.setItem(18, item);
        inv.setItem(26, item);
        inv.setItem(27, item);
        inv.setItem(35, item);
        inv.setItem(36, item);
        inv.setItem(44, item);
        inv.setItem(45, item);

        inv.setItem(46, item);
        inv.setItem(47, item);
        inv.setItem(48, item);
        inv.setItem(49, item);

        inv.setItem(51, item);
        inv.setItem(52, item);
        inv.setItem(53, item);
        inv.setItem(54, item);



    }
}
