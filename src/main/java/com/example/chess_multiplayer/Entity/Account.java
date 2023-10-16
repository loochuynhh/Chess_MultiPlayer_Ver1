package com.example.chess_multiplayer.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account", schema = "db_pbl4_ver2")
public class Account {
    @Id
    @Column(name = "IDUser", nullable = false, length = 5)
    private String iDUser;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDUser", nullable = false)
    private User user;

    @Column(name = "Username", length = 50)
    private String username;

    @Column(name = "Password", length = 50)
    private String password;

    public String getIDUser() {
        return iDUser;
    }

    public void setIDUser(String iDUser) {
        this.iDUser = iDUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}