package ru.traiwy.skillProgressPlugin.service;

import lombok.AllArgsConstructor;
import ru.traiwy.skillProgressPlugin.dto.Player;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;

import java.util.concurrent.CompletableFuture;

@AllArgsConstructor
public class DatabaseService {
    private final DatabaseSkillRepository skillRepository;

    public CompletableFuture<Void> add(Player player) {
        return skillRepository.add(player);
    }

    public CompletableFuture<Void> remove(Player player) {
        return skillRepository.delete(player);
    }

    public CompletableFuture<Player> getPlayer(String name) {
        return skillRepository.getPlayer(name);
    }

}
