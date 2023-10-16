package com.example.chess_multiplayer.Entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user", schema = "db_pbl4_ver2")
public class User {
    @Id
    @Column(name = "IDUser", nullable = false, length = 5)
    private String iDUser;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDUser", nullable = false)
    private Account account;

    @Column(name = "Ava")
    private Integer ava;

    @Column(name = "Elo")
    private Integer elo;

    @Column(name = "Win")
    private Integer win;

    @Column(name = "Lose")
    private Integer lose;

    @Column(name = "Draw")
    private Integer draw;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDUser", nullable = false)
    private Account account1;

    @OneToMany(mappedBy = "iDUser")
    private Set<Friend> friends = new LinkedHashSet<>();

    @OneToMany(mappedBy = "iDUser")
    private Set<Roomuser> roomusers = new LinkedHashSet<>();

    public Set<Roomuser> getRoomusers() {
        return roomusers;
    }

    public void setRoomusers(Set<Roomuser> roomusers) {
        this.roomusers = roomusers;
    }

    public Set<Friend> getFriends() {
        return friends;
    }

    public void setFriends(Set<Friend> friends) {
        this.friends = friends;
    }

    public Account getAccount1() {
        return account1;
    }

    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    public String getIDUser() {
        return iDUser;
    }

    public void setIDUser(String iDUser) {
        this.iDUser = iDUser;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getAva() {
        return ava;
    }

    public void setAva(Integer ava) {
        this.ava = ava;
    }

    public Integer getElo() {
        return elo;
    }

    public void setElo(Integer elo) {
        this.elo = elo;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

}