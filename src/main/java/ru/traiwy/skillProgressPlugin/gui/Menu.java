package ru.traiwy.skillProgressPlugin.gui;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import ru.traiwy.skillProgressPlugin.PluginContext;
import ru.traiwy.skillProgressPlugin.configuration.menu.IconConfiguration;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public abstract class Menu implements InventoryHolder, Listener {
    private final Inventory inventory;
    private int size;
    private String title;
    protected Map<Integer, IconConfiguration> slots = new HashMap<>();

    public Menu(PluginContext context, String id) {
        this.inventory = Bukkit.createInventory(
                        this,
                context.configuration().getConfiguration().menus().get(id).size(),
                context.configuration().getConfiguration().menus().get(id).title());
    }

    public abstract void setup(Player player);

    public void open(Player player) {
        if(inventory == null) return;
        setup(player);
        player.openInventory(inventory);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        event.setCancelled(true);

        int slot = event.getRawSlot();
        if(slot < 0 || slot >= inventory.getSize()) return;

        IconConfiguration slotsIcon = slots.get(slot);
        if(slotsIcon != null) {
            slotsIcon.action();
        }
    }

}
