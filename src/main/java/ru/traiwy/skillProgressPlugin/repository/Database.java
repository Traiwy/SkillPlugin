package ru.traiwy.skillProgressPlugin.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Getter;
import ru.traiwy.skillProgressPlugin.configuration.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    @Getter
    private HikariDataSource ds;
    private DatabaseConfiguration config;

    public Database() {
        create();
        hikariconnect();
    }


    private void create() {
        final String sql = "jdbc:mysql://" + config.host() + ":" + config.port() +
                "/?useSSL=false&serverTimezone=UTC";

        try (Connection conn = java.sql.DriverManager.getConnection(
                sql, config.user(), config.password());
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(
                    "CREATE DATABASE IF NOT EXISTS `" + config.database() + "` " +
                            "CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;"
            );
        } catch (SQLException ex) {
            throw new RuntimeException("Failed to create database", ex);
        }
    }
    private void hikariconnect() {
        final String url = "jdbc:mysql://" + config.host() + ":" + config.port() +
                "/" + config.database() +
                "?useSSL=false" +
                "&allowPublicKeyRetrieval=true" +
                "&useUnicode=true" +
                "&characterEncoding=UTF-8" +
                "&serverTimezone=UTC";

        final HikariConfig hikari = new HikariConfig();
        hikari.setJdbcUrl(url);
        hikari.setUsername(config.user());
        hikari.setPassword(config.password());

        hikari.setMaximumPoolSize(10);
        hikari.setMinimumIdle(2);
        hikari.setPoolName("HomePluginPool");

        ds = new HikariDataSource(hikari);
    }

}
