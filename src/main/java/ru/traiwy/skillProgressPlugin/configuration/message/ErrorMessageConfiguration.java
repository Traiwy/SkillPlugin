package ru.traiwy.skillProgressPlugin.configuration.message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorMessageConfiguration {
    String error1 = "error1";
}
