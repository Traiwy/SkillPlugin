package ru.traiwy.skillProgressPlugin.repository.skill;

import ru.traiwy.skillProgressPlugin.dto.Player;
import ru.traiwy.skillProgressPlugin.repository.Repository;

import java.util.concurrent.CompletableFuture;

public interface SkillRepository extends Repository<Player> {
    CompletableFuture<Player> getPlayer(String name);

}
