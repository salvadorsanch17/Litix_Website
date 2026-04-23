package com.Litix.fantasy.player;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.hibernate.annotations.Type;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import lombok.*;

@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String postion;
    private String team;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
