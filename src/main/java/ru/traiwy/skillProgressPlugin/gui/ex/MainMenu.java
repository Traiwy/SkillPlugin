package ru.traiwy.skillProgressPlugin.gui.ex;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.traiwy.skillProgressPlugin.PluginContext;
import ru.traiwy.skillProgressPlugin.Util.ItemBuilder;
import ru.traiwy.skillProgressPlugin.configuration.menu.IconConfiguration;
import ru.traiwy.skillProgressPlugin.gui.Menu;

import java.util.List;

public class MainMenu extends Menu {
    private final PluginContext context;
    public MainMenu(PluginContext context) {
        super(context, "main_menu");

        this.context = context;
    }

    @Override
    public void setup(Player player) {

        List<IconConfiguration> icons = context.configuration().getConfiguration().menus().get("main_menu").icons();
        for(IconConfiguration icon : icons) {
            ItemStack item = icon.build();
            getInventory().setItem(icon.slot(), item);
        }

    }
}
