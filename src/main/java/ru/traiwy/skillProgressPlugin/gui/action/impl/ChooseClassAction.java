package ru.traiwy.skillProgressPlugin.gui.action.impl;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.dto.Skill;
import ru.traiwy.skillProgressPlugin.dto.User;
import ru.traiwy.skillProgressPlugin.gui.action.MenuAction;
import ru.traiwy.skillProgressPlugin.service.MenuService;

@AllArgsConstructor
public class ChooseClassAction implements MenuAction {
    private final SkillCache cache;
    private MenuService menuService;

    @Override
    public void execute(Player player, String[] args) {
        if (args.length == 0) return;
        final String className = args[0];
        final User user = cache.getPlayer(player.getName());
        user.className(Skill.valueOf(className));
        menuService.main().open(player);

    }
}
