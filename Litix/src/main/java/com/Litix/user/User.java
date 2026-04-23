package com.Litix.user;

import jakarta.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import lombok.*;

@Entity
@Table(name="users") //generates users table for PostgreSQL
@RequiredArgsConstructor
public class User implements UserDetails { //User class/ Model

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //generates id for table

    private String displayName;
    private String username;
    private String email;
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    //Authorization overrides
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    //constructors
    public User(Long id, String displayName, String username, String email, String password) {
        this.id = id;
        this.displayName = displayName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String displayName, String username, String email, String password) { //no id constructor
        this.displayName = displayName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //Setters and Getters
    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
