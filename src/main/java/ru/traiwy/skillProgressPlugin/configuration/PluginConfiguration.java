package ru.traiwy.skillProgressPlugin.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ru.traiwy.skillProgressPlugin.configuration.menu.MenuConfiguration;
import ru.traiwy.skillProgressPlugin.configuration.message.MessageConfiguration;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PluginConfiguration {
    final MessageConfiguration message = new MessageConfiguration();
    final DatabaseConfiguration database = new DatabaseConfiguration();
    final Map<String, MenuConfiguration> menus = new HashMap<>(Map.of("main_menu", new MenuConfiguration()));
}
