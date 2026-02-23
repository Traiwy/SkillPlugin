package ru.traiwy.skillProgressPlugin.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Player {
    String name;
    CustomClass className;
    int level;
    double progress;
}
