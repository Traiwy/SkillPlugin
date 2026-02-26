package ru.traiwy.skillProgressPlugin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ru.traiwy.skillProgressPlugin.configuration.Configuration;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.service.DatabaseService;
import ru.traiwy.skillProgressPlugin.service.MenuService;

@Getter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PluginContext {
    Database database;
    DatabaseService databaseService;
    MenuService menuService;
    Configuration configuration;

    public PluginContext(Database database, Configuration configuration) {
        this.database = database;
        this.configuration = configuration;
        databaseService = new DatabaseService(database);
        menuService = new MenuService(this);

    }
}
