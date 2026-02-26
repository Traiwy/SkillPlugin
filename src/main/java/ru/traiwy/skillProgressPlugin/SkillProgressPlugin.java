package ru.traiwy.skillProgressPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.command.SkillCommand;
import ru.traiwy.skillProgressPlugin.configuration.Configuration;
import ru.traiwy.skillProgressPlugin.gui.MenuListener;
import ru.traiwy.skillProgressPlugin.listener.CacheListener;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.service.facade.CacheFacade;


public final class SkillProgressPlugin extends JavaPlugin {
    private Database database;

    @Override
    public void onEnable() {
        Configuration config = new Configuration(this);
        database = new Database(config.getConfiguration().database());
        PluginContext pluginContext = new PluginContext(database, config);
        getServer().getPluginManager().registerEvents(new CacheListener(pluginContext.cacheFacade(), pluginContext.skillCache()), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
        getCommand("skill").setExecutor(new SkillCommand(pluginContext.menuService(),  pluginContext.skillCache()));
    }

    @Override
    public void onDisable() {
        if (database != null) {
            database.shutdown();
        }
    }
}
