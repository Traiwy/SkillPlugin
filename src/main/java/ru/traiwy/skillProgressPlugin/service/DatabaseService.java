package ru.traiwy.skillProgressPlugin.service;

import ru.traiwy.skillProgressPlugin.dto.User;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;

import java.util.concurrent.CompletableFuture;


public class DatabaseService {
    private final DatabaseSkillRepository skillRepository;

    public DatabaseService(Database database) {
        this.skillRepository = new DatabaseSkillRepository(database);
    }

    public CompletableFuture<User> add(User user) {
        return skillRepository.add(user);
    }

    public CompletableFuture<Void> remove(User user) {
        return skillRepository.delete(user);
    }

    public CompletableFuture<User> getPlayer(String name) {
        return skillRepository.getPlayer(name);
    }

    public CompletableFuture<Void> update(User user) {
        return skillRepository.update(user);
    }

}
