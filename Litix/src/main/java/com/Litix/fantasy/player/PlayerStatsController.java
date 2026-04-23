package com.Litix.fantasy.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/player_stats")
public class PlayerStatsController {
    private final PlayerStatsRepository repo;

    public PlayerStatsController(PlayerStatsRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{playerId}")
    public List<PlayerStats> getStats(@PathVariable String playerId) {
        return repo.findByPlayerId(playerId);
    }
}
