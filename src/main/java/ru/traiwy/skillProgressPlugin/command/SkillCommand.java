package ru.traiwy.skillProgressPlugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.traiwy.skillProgressPlugin.command.impl.HelpCommand;
import ru.traiwy.skillProgressPlugin.gui.ex.MainMenu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillCommand implements CommandExecutor, TabExecutor {
    private final Map<String, SubCommand> subCommands = new HashMap<>();

    private final MainMenu main;
    public SkillCommand(MainMenu main) {
        this.main = main;
        subCommands.put("help", new HelpCommand());
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player player)) return false;
        main.open(player);
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return List.of();
    }
}
