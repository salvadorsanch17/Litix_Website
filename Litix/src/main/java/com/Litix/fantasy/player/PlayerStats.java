package com.Litix.fantasy.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class PlayerStats {
    @Id
    @GeneratedValue
    private Long id;

    private String playerId;
    private int season;
    private int week;
    private String team;
    private int gamesPlayed;
    private float passingYards;
    private float rushingYards;
    private float receivingYards;
    private int passingTd;
    private int rushingTd;
    private int receivingTd;
    private float sacksSuffered;
    private int attempts;
    private int completions;
    private int targets;
    private int receptions;
    private int passingInts;
    private int carries;
    private int rushingFumbles;
    private int receivingFumbles;
    private float offPct;
    private float defSacks;
    private int defInts;
    private int defPassDefended;

    public Long getId() {
        return id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public int getSeason() {
        return season;
    }

    public int getWeek() {
        return week;
    }

    public String getTeam() {
        return team;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public float getPassingYards() {
        return passingYards;
    }

    public float getRushingYards() {
        return rushingYards;
    }

    public float getReceivingYards() {
        return receivingYards;
    }

    public int getPassingTd() {
        return passingTd;
    }

    public int getRushingTd() {
        return rushingTd;
    }

    public int getReceivingTd() {
        return receivingTd;
    }

    public float getSacksSuffered() {
        return sacksSuffered;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getCompletions() {
        return completions;
    }

    public int getTargets() {
        return targets;
    }

    public int getReceptions() {
        return receptions;
    }

    public int getPassingInts() {
        return passingInts;
    }

    public int getCarries() {
        return carries;
    }

    public int getRushingFumbles() {
        return rushingFumbles;
    }

    public int getReceivingFumbles() {
        return receivingFumbles;
    }

    public float getOffPct() {
        return offPct;
    }

    public float getDefSacks() {
        return defSacks;
    }

    public int getDefInts() {
        return defInts;
    }

    public int getDefPassDefended() {
        return defPassDefended;
    }
}
