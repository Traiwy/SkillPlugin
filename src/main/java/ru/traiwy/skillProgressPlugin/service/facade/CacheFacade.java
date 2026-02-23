package ru.traiwy.skillProgressPlugin.service.facade;

import lombok.AllArgsConstructor;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.dto.Player;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;

@AllArgsConstructor
public class CacheFacade {
    private final SkillCache cache;
    private final DatabaseSkillRepository service;

    public void add(String name) {
        service.getPlayer(name).thenAccept(p -> {
            if(p == null) new Player();
            cache.addPlayer(name, p);
        });
    }

    public void remove(Player player) {
        service.update(player);
        cache.removePlayer(player);
    }

    public void update(String name, Player newPlayer) {
        cache.addPlayer(name, newPlayer);
    }

}
