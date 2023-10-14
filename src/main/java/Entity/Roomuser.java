package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roomuser", indexes = {
        @Index(name = "idRoom_UNIQUE", columnList = "idRoom", unique = true),
        @Index(name = "idUser_UNIQUE", columnList = "idUser", unique = true)
})
public class Roomuser {
    @Id
    @Column(name = "idRoomUser", nullable = false, length = 45)
    private String idRoomUser;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idRoom", nullable = false)
    private Room idRoom;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private User idUser;

    @Column(name = "chat", length = 10000)
    private String chat;

    @Column(name = "result", length = 45)
    private String result;

    public Roomuser(String idRoomUser, Room idRoom, User idUser, String chat, String result) {
        this.idRoomUser = idRoomUser;
        this.idRoom = idRoom;
        this.idUser = idUser;
        this.chat = chat;
        this.result = result;
    }

    public Roomuser(String number, String id, String s, String chat1, String result1) {

    }

    public String getIdRoomUser() {
        return idRoomUser;
    }

    public void setIdRoomUser(String idRoomUser) {
        this.idRoomUser = idRoomUser;
    }

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
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