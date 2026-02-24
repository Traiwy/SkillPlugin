package ru.traiwy.skillProgressPlugin.repository.skill;

import ru.traiwy.skillProgressPlugin.dto.PlayerDTO;
import ru.traiwy.skillProgressPlugin.repository.Repository;

import java.util.concurrent.CompletableFuture;

public interface SkillRepository extends Repository<PlayerDTO> {
    CompletableFuture<PlayerDTO> getPlayer(String name);

}
