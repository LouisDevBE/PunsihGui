package me.louisdev.punishgui_wintox.Events;

import me.louisdev.punishgui_wintox.manager.SecondGui;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class events implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void guiClickEvent(InventoryClickEvent event) {
        if (!event.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&cPunishgui")))
            return;

        if (event.getCurrentItem() == null)
            return;

        Player player = (Player)event.getWhoClicked();

        ItemStack is = event.getCurrentItem();
        if (is == null)
            return;

        if (is.getType() == Material.REDSTONE_BLOCK) {
            Inventory inv = Bukkit.createInventory(null, 54, ChatColor.translateAlternateColorCodes('&', "&cPunishguibans"));
            int id = Integer.parseInt(ChatColor.stripColor(is.getItemMeta().getDisplayName().split(" ")[1].substring(1)));
            new SecondGui(id, player, inv);
        }

        event.setCancelled(true);
    }
}
