package ru.traiwy.skillProgressPlugin.service;

import lombok.AllArgsConstructor;
import ru.traiwy.skillProgressPlugin.dto.PlayerDTO;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;

import java.util.concurrent.CompletableFuture;


public class DatabaseService {
    private final DatabaseSkillRepository skillRepository;

    public DatabaseService(Database database) {
        this.skillRepository = new DatabaseSkillRepository(database);
    }

    public CompletableFuture<PlayerDTO> add(PlayerDTO playerDTO) {
        return skillRepository.add(playerDTO);
    }

    public CompletableFuture<Void> remove(PlayerDTO playerDTO) {
        return skillRepository.delete(playerDTO);
    }

    public CompletableFuture<PlayerDTO> getPlayer(String name) {
        return skillRepository.getPlayer(name);
    }

    public CompletableFuture<Void> update(PlayerDTO playerDTO) {
        return skillRepository.update(playerDTO);
    }

}
