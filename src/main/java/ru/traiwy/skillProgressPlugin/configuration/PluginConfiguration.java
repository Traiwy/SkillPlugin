package ru.traiwy.skillProgressPlugin.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ru.traiwy.skillProgressPlugin.configuration.menu.MenuConfiguration;
import ru.traiwy.skillProgressPlugin.configuration.message.MessageConfiguration;
import ru.traiwy.skillProgressPlugin.configuration.task.LevelTaskConfiguration;
import ru.traiwy.skillProgressPlugin.dto.Skill;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PluginConfiguration {
    MessageConfiguration message = new MessageConfiguration();
    DatabaseConfiguration database = new DatabaseConfiguration();
    Map<String, MenuConfiguration> menus = new HashMap<>(Map.of("main_menu", new MenuConfiguration()));
    Map<Skill, LevelTaskConfiguration> taskWarrior = new HashMap<>(Map.of(
            Skill.WARRIOR, new LevelTaskConfiguration()
    ));

    Map<Skill, LevelTaskConfiguration> taskFarmer = new HashMap<>(Map.of(
            Skill.FARMER, new LevelTaskConfiguration()
    ));

}
