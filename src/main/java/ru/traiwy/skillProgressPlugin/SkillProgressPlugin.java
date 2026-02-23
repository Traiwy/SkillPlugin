package ru.traiwy.skillProgressPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import ru.traiwy.skillProgressPlugin.command.SkillCommand;
import ru.traiwy.skillProgressPlugin.configuration.Configuration;
import ru.traiwy.skillProgressPlugin.service.MenuService;


public final class SkillProgressPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        MenuService menuService = new MenuService();
        Configuration config = new Configuration(this);
        getCommand("skill").setExecutor(new SkillCommand(menuService.getMain()));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
