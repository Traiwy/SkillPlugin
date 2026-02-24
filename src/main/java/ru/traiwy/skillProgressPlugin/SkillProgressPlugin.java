package ru.traiwy.skillProgressPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.command.SkillCommand;
import ru.traiwy.skillProgressPlugin.configuration.Configuration;
import ru.traiwy.skillProgressPlugin.listener.CacheListener;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.service.DatabaseService;
import ru.traiwy.skillProgressPlugin.service.MenuService;
import ru.traiwy.skillProgressPlugin.service.facade.CacheFacade;


public final class SkillProgressPlugin extends JavaPlugin {
    private Database database;

    @Override
    public void onEnable() {
        Configuration config = new Configuration(this);
        database = new Database(config.getConfiguration().database());
        MenuService menuService = new MenuService();
        DatabaseService databaseService = new DatabaseService(database);
        SkillCache skillCache = new SkillCache();
        CacheFacade cacheFacade = new CacheFacade(skillCache, databaseService);

        getServer().getPluginManager().registerEvents(new CacheListener(cacheFacade), this);
        getCommand("skill").setExecutor(new SkillCommand(menuService,skillCache));
    }

    @Override
    public void onDisable() {
        if (database != null) {
            database.shutdown();
        }
    }
}
