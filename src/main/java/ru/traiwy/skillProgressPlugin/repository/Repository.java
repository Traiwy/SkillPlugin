package ru.traiwy.skillProgressPlugin.repository;


import java.util.concurrent.CompletableFuture;

public interface Repository<T> {
    CompletableFuture<T> add(T entity);

    CompletableFuture<Void> delete(T entity);

    CompletableFuture<Void> update(T entity);
}
