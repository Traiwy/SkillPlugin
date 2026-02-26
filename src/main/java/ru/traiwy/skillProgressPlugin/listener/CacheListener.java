package ru.traiwy.skillProgressPlugin.listener;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.dto.User;
import ru.traiwy.skillProgressPlugin.service.facade.CacheFacade;

@AllArgsConstructor
public class CacheListener implements Listener {
    private CacheFacade cache;
    private SkillCache cacheSkill;

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        cache.get(player.getName());
        System.out.println("3i");

    }

    @EventHandler
    public void onLeaveEvent(PlayerQuitEvent event) {
        final Player player = event.getPlayer();
        final User user = cacheSkill.getPlayer(player.getName());
        cache.add(user);
    }
}
