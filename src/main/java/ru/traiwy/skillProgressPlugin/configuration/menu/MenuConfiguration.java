package ru.traiwy.skillProgressPlugin.configuration.menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MenuConfiguration {
    String type = "type";
    String title = "title";
    int size = 54;
    List<IconConfiguration> icons = new ArrayList<>(List.of(
            new IconConfiguration()
    ));

}
