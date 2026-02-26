package ru.traiwy.skillProgressPlugin.gui.button;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public record Button(ItemStack item, Consumer<InventoryClickEvent> action) {
    public void onClick(InventoryClickEvent event) {
        if(action != null) action.accept(event);
    }
}
