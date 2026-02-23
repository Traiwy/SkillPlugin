package ru.traiwy.skillProgressPlugin.gui;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

@Getter
public abstract class Menu implements InventoryHolder {
    private Inventory inventory;
    private int size;
    private String title;

    public Menu(int size, @NotNull String title) {
        this.inventory = Bukkit.createInventory(this, size, title);
    }
    public abstract void setup();

    public void open(Player player) {
        player.openInventory(inventory);
    }
}
