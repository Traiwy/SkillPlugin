package ru.traiwy.skillProgressPlugin.service.facade;

import lombok.AllArgsConstructor;
import ru.traiwy.skillProgressPlugin.cache.SkillCache;
import ru.traiwy.skillProgressPlugin.dto.PlayerDTO;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;
import ru.traiwy.skillProgressPlugin.service.DatabaseService;

import java.util.concurrent.CompletableFuture;

@AllArgsConstructor
public class CacheFacade {
    private final SkillCache cache;
    private final DatabaseService service;

    public CompletableFuture<PlayerDTO> add(String name) {
        System.out.println("Тут начинается метод");
        return service.getPlayer(name).thenApply(p -> {
            PlayerDTO playerDTO = p;
            if (playerDTO == null) {
                System.out.println("1");
                playerDTO = new PlayerDTO(name, null, 0, 0);
                cache.addPlayer(name, playerDTO);
                return playerDTO;
            }
            System.out.println("2");
            cache.addPlayer(name, p);
            return playerDTO;
        });
    }

    public void remove(PlayerDTO playerDTO) {
        service.remove(playerDTO);
        cache.removePlayer(playerDTO);
    }

    public void update(String name, PlayerDTO newPlayerDTO) {
        cache.addPlayer(name, newPlayerDTO);
    }

}
