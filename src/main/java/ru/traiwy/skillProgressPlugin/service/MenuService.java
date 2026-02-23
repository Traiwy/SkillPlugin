package ru.traiwy.skillProgressPlugin.service;

import lombok.Getter;
import ru.traiwy.skillProgressPlugin.gui.ex.MainMenu;

@Getter
public class MenuService {
    private final MainMenu main;

    public MenuService() {
        this.main = new MainMenu();
    }
}
