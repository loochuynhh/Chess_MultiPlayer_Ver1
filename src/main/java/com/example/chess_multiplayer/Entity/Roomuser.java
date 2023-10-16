package com.example.chess_multiplayer.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roomuser", schema = "db_pbl4_ver2", indexes = {
        @Index(name = "FK_RoomUser_User_idx", columnList = "IDUser"),
        @Index(name = "FK_RoomUser_Room_idx", columnList = "IDRoom")
})
public class Roomuser {
    @Id
    @Column(name = "IDRoomUser", nullable = false, length = 5)
    private String iDRoomUser;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDUser", nullable = false)
    private User iDUser;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IDRoom", nullable = false)
    private Room iDRoom;

    @Column(name = "Chat", length = 1000)
    private String chat;

    @Column(name = "Result", length = 50)
    private String result;

    public String getIDRoomUser() {
        return iDRoomUser;
    }

    public void setIDRoomUser(String iDRoomUser) {
        this.iDRoomUser = iDRoomUser;
    }

    public User getIDUser() {
        return iDUser;
    }

    public void setIDUser(User iDUser) {
        this.iDUser = iDUser;
    }

    public Room getIDRoom() {
        return iDRoom;
    }

    public void setIDRoom(Room iDRoom) {
        this.iDRoom = iDRoom;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}