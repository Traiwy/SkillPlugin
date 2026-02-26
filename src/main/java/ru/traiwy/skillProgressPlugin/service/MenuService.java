package ru.traiwy.skillProgressPlugin.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import ru.traiwy.skillProgressPlugin.PluginContext;
import ru.traiwy.skillProgressPlugin.gui.action.MenuActionRegistry;
import ru.traiwy.skillProgressPlugin.gui.ex.ChooseMenu;
import ru.traiwy.skillProgressPlugin.gui.ex.MainMenu;

@Getter
@Accessors(fluent = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MenuService {
    MainMenu main;
    ChooseMenu choose;
    MenuActionRegistry registry;

    public MenuService(PluginContext context) {
        this.choose = new ChooseMenu(context);
        this.main = new MainMenu(context);
        this.registry = new MenuActionRegistry(context);
    }
}
