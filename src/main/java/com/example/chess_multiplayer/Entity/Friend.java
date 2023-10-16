package com.example.chess_multiplayer.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "friend", schema = "db_pbl4_ver2", indexes = {
        @Index(name = "FK_Friend_User_UserID_idx", columnList = "IDUser"),
        @Index(name = "FK_Friend_User_FriendID_idx", columnList = "IDFriend")
})
public class Friend {
    @Id
    @Column(name = "ID", nullable = false, length = 5)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDUser", nullable = false)
    private User iDUser;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDFriend", nullable = false)
    private User iDFriend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getIDUser() {
        return iDUser;
    }

    public void setIDUser(User iDUser) {
        this.iDUser = iDUser;
    }

    public User getIDFriend() {
        return iDFriend;
    }

    public void setIDFriend(User iDFriend) {
        this.iDFriend = iDFriend;
    }

}