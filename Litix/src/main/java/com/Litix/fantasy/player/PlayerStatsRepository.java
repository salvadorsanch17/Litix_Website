package com.Litix.fantasy.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {
    List<PlayerStats> findByPlayerId(String playerId);
    List<PlayerStats> findByPlayerIdAndSeason(String playerId, int season);

}
