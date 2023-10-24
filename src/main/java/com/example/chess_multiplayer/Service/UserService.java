package com.example.chess_multiplayer.Service;

import com.example.chess_multiplayer.Entity.Account;
import com.example.chess_multiplayer.Entity.User;
import com.example.chess_multiplayer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void addUserData(){
        try {
            User user1 = new User();
            user1.setIDUser("user1");
            user1.setAva(1);
            user1.setElo(1200);
            user1.setWin(10);
            user1.setLose(5);
            user1.setDraw(2);
            // Tạo đối tượng Account
            Account account1 = new Account();
            account1.setIDUser("user1");
            account1.setUsername("user1_username");
            account1.setPassword("user1_password");
            // Thiết lập liên kết 1-1
            user1.setAccount(account1);
            user1.setFriends(new HashSet<>());
            user1.setRoomusers(new HashSet<>());
            account1.setUser(user1);

            User user2 = new User();
            user2.setIDUser("user2");
            user2.setAva(2);
            user2.setElo(1300);
            user2.setWin(8);
            user2.setLose(6);
            user2.setDraw(3);

            Account account2 = new Account();
            account2.setIDUser("user2");
            account2.setUsername("user2_username");
            account2.setPassword("user2_password");
            // Thiết lập liên kết 1-1
            user2.setAccount(account2);
            user2.setFriends(new HashSet<>());
            user2.setRoomusers(new HashSet<>());
            account2.setUser(user2);

            User user3 = new User();
            user3.setIDUser("user3");
            user3.setAva(4);
            user3.setElo(1000);
            user3.setWin(4);
            user3.setLose(6);
            user3.setDraw(6);

            Account account3 = new Account();
            account3.setIDUser("user3");
            account3.setUsername("user3_username");
            account3.setPassword("user3_password");
            // Thiết lập liên kết 1-1
            user3.setAccount(account3);
            user3.setFriends(new HashSet<>());
            user3.setRoomusers(new HashSet<>());
            account3.setUser(user3);

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public User findUserById(String idUser){
        return userRepository.findByIDUser(idUser);
    }
}
