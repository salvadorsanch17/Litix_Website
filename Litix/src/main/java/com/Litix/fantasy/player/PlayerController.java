package com.Litix.fantasy.player;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/{id}")
    public Player getPlayer (@PathVariable Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    @GetMapping("/search")
    public List<Player> searchPlayers(@RequestParam String name) {
        return playerRepository.findByNameContainingIgnoreCase(name);
    }
}
