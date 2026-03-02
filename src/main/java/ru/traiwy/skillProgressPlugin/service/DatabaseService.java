package ru.traiwy.skillProgressPlugin.service;

import ru.traiwy.skillProgressPlugin.dto.Task;
import ru.traiwy.skillProgressPlugin.dto.User;
import ru.traiwy.skillProgressPlugin.repository.Database;
import ru.traiwy.skillProgressPlugin.repository.skill.DatabaseSkillRepository;
import ru.traiwy.skillProgressPlugin.repository.task.DatabaseTaskRepository;
import ru.traiwy.skillProgressPlugin.repository.task.TaskRepository;

import java.util.concurrent.CompletableFuture;


public class DatabaseService {
    private final DatabaseSkillRepository skillRepository;
    private final DatabaseTaskRepository taskRepository;

    public DatabaseService(Database database) {
        this.skillRepository = new DatabaseSkillRepository(database);
        this.taskRepository = new DatabaseTaskRepository(database);
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

   // public CompletableFuture<Void> update(User user) {
   //     return skillRepository.update(user);
   // }

    public CompletableFuture<Task> add(Task task) {
        return taskRepository.add(task);
    }

    public CompletableFuture<Void> remove(Task task) {
        return taskRepository.delete(task);
    }

    public CompletableFuture<Task> getTask(int id) {
        return taskRepository.get(id);
    }

   // public CompletableFuture<Void> update(User user) {
   //     return skillRepository.update(user);
   // }

}
