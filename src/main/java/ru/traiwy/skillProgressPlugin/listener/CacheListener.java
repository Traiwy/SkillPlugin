package ru.traiwy.skillProgressPlugin.listener;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import ru.traiwy.skillProgressPlugin.service.facade.CacheFacade;

@AllArgsConstructor
public class CacheListener implements Listener {
    private CacheFacade cache;

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        cache.add(player.getName());

    }
    @EventHandler
    public void onLeaveEvent(PlayerQuitEvent event) {
    }
}
