package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "friend", indexes = {
        @Index(name = "IdUser_UNIQUE", columnList = "IdUser", unique = true)
})
public class Friend {
    @Id
    @Column(name = "id", nullable = false, length = 45)
    private String id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdUser", nullable = false)
    private User idUser;

    @Column(name = "FriendId", length = 45)
    private String friendId;

    public Friend(String id, User idUser, String friendId) {
        this.id = id;
        this.idUser = idUser;
        this.friendId = friendId;
    }

    public Friend(String number, String id, String friendId) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

}