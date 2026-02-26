package ru.traiwy.skillProgressPlugin.gui.action.impl;

import org.bukkit.entity.Player;
import ru.traiwy.skillProgressPlugin.gui.action.MenuAction;

public class ChooseClassAction implements MenuAction {
    @Override
    public void execute(Player player, String[] args) {
        if (args.length == 0) return;
        String className = args[0];
        System.out.println("choose class: " + className);
    }
}
