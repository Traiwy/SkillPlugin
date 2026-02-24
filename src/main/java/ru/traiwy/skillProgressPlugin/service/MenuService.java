package ru.traiwy.skillProgressPlugin.service;

import lombok.Getter;
import ru.traiwy.skillProgressPlugin.gui.ex.ChooseMenu;
import ru.traiwy.skillProgressPlugin.gui.ex.MainMenu;

@Getter
public class MenuService {
    private final MainMenu main;
    private final ChooseMenu choose;

    public MenuService() {
        this.choose = new ChooseMenu();
        this.main = new MainMenu();
    }
}
