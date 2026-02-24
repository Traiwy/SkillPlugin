package ru.traiwy.skillProgressPlugin.gui.ex;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.traiwy.skillProgressPlugin.Util.ItemBuilder;
import ru.traiwy.skillProgressPlugin.gui.Menu;

public class ChooseMenu extends Menu {
    public ChooseMenu() {
        super(27, "Choose_menu");
    }

    @Override
    public void setup(Player player) {
        ItemStack item = new ItemBuilder(Material.PLAYER_HEAD)
                .name("Воин")
                .build();

        ItemStack item1 = new ItemBuilder(Material.PLAYER_HEAD)
                .name("Фермер")
                .build();

        getInventory().setItem(11, item);
        getInventory().setItem(15, item);

    }
}
