package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "idAccount", nullable = false, length = 45)
    private String idAccount;

    @Column(name = "useName", length = 45)
    private String useName;

    @Column(name = "passWord", length = 45)
    private String passWord;

    @OneToOne(mappedBy = "accountID")
    private User user;

    public Account(String idAccount, String useName, String passWord, User user) {
        this.idAccount = idAccount;
        this.useName = useName;
        this.passWord = passWord;
        this.user = user;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}