package ru.traiwy.skillProgressPlugin.cache;

import ru.traiwy.skillProgressPlugin.dto.PlayerDTO;

import java.util.HashMap;
import java.util.Map;

public class SkillCache {
    private final Map<String, PlayerDTO> players = new HashMap<>();

    public void addPlayer(String name, PlayerDTO playerDTO) {
        players.put(name, playerDTO);
    }

    public void removePlayer(PlayerDTO playerDTO) {
        players.remove(playerDTO);
    }

    public void clear() {
        players.clear();
    }

    public PlayerDTO getPlayer(String name) {
        return players.get(name);
    }


}
