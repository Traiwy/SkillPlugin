package ru.traiwy.skillProgressPlugin.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ru.traiwy.skillProgressPlugin.configuration.message.MessageConfiguration;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PluginConfiguration {
    //
    MessageConfiguration message = new MessageConfiguration();
    DatabaseConfiguration database = new DatabaseConfiguration();
}
