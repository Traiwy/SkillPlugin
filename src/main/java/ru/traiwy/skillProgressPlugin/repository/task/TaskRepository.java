package ru.traiwy.skillProgressPlugin.repository.task;

import ru.traiwy.skillProgressPlugin.dto.Task;
import ru.traiwy.skillProgressPlugin.repository.Repository;

import java.util.concurrent.CompletableFuture;

public interface TaskRepository extends Repository<Task> {
    CompletableFuture<Task> get(int id);
}
