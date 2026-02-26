package ru.traiwy.skillProgressPlugin.service;

import lombok.Getter;
import ru.traiwy.skillProgressPlugin.PluginContext;
import ru.traiwy.skillProgressPlugin.gui.ex.ChooseMenu;
import ru.traiwy.skillProgressPlugin.gui.ex.MainMenu;

@Getter
public class MenuService {
    private final MainMenu main;
    private final ChooseMenu choose;

    public MenuService(PluginContext context) {
        this.choose = new ChooseMenu(context);
        this.main = new MainMenu(context);
    }
}
