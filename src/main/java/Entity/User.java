package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user", indexes = {
        @Index(name = "AccountID_UNIQUE", columnList = "AccountID", unique = true)
})
@EntityListeners(Roomuser.class)
public class User {
    @Id
    @Column(name = "idUser", nullable = false, length = 45)
    private String idUser;

    @Column(name = "Ava")
    private Integer ava;

    @Column(name = "Elo")
    private Integer elo;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AccountID", nullable = false)
    private Account accountID;

    @Column(name = "win")
    private Integer win;

    @Column(name = "lose")
    private Integer lose;

    @Column(name = "draw")
    private Integer draw;

    @OneToOne(mappedBy = "idUser")
    private Friend friend;

    @OneToOne(mappedBy = "idUser")
    private Roomuser roomuser;

    public User(String idUser, Integer ava, Integer elo, Account accountID, Integer win, Integer lose, Integer draw, Friend friend, Roomuser roomuser) {
        this.idUser = idUser;
        this.ava = ava;
        this.elo = elo;
        this.accountID = accountID;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.friend = friend;
        this.roomuser = roomuser;
    }

    public User(String number, int i, int i1, String id, int i2, int i3, int i4) {

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
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

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
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

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Roomuser getRoomuser() {
        return roomuser;
    }

    public void setRoomuser(Roomuser roomuser) {
        this.roomuser = roomuser;
    }

}