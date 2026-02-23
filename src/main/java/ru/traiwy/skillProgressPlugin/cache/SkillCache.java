package ru.traiwy.skillProgressPlugin.cache;

import ru.traiwy.skillProgressPlugin.dto.Player;

import java.util.HashMap;
import java.util.Map;

public class SkillCache {
    private final Map<String, Player> players = new HashMap<>();

    public void addPlayer(String name, Player player) {
        players.put(name, player);
    }
    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void clear() {
        players.clear();
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }


}
