package ru.traiwy.skillProgressPlugin.repository.skill;

import ru.traiwy.skillProgressPlugin.dto.Player;

import java.util.concurrent.CompletableFuture;

public class DatabaseSkillRepository implements SkillRepository{
    @Override
    public CompletableFuture<Void> add(Player entity) {
        return null;
    }

    @Override
    public CompletableFuture<Void> delete(Player entity) {
        return null;
    }

    @Override
    public CompletableFuture<Void> update(Player entity) {
        return null;
    }

    @Override
    public CompletableFuture<Player> getPlayer(String name) {
        return null;
    }
}
