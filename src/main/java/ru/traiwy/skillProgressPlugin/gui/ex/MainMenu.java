package ru.traiwy.skillProgressPlugin.gui.ex;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.traiwy.skillProgressPlugin.Util.ItemBuilder;
import ru.traiwy.skillProgressPlugin.gui.Menu;

import java.util.Arrays;

public class MainMenu extends Menu {
    public MainMenu() {
        super(54, "MainMenu");
    }

    @Override
    public void setup(Player player) {
        ItemStack item = new ItemBuilder(Material.PLAYER_HEAD)
                .name("Ник игрока: " + player.getName())
                .lore(Arrays.asList(
                        "Выбранный класс игрока: "
                )).build();

        ItemStack item2 = new ItemBuilder(Material.NETHER_STAR)
                .name("Ваш уровень: ")
                        .lore(Arrays.asList(
                                "Ваш прогресс: "
                        )).build();

        getInventory().setItem(11, item);
        getInventory().setItem(15, item2);

    }
}
