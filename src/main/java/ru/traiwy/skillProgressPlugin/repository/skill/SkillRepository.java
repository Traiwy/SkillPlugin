package ru.traiwy.skillProgressPlugin.repository.skill;

import ru.traiwy.skillProgressPlugin.dto.User;
import ru.traiwy.skillProgressPlugin.repository.Repository;

import java.util.concurrent.CompletableFuture;

public interface SkillRepository extends Repository<User> {
    CompletableFuture<User> getPlayer(String name);

}
