package com.example.chess_multiplayer.Service;

import com.example.chess_multiplayer.Entity.User;
import com.example.chess_multiplayer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void addUserData(){
        User user1 = new User();
        user1.setIDUser("user1");
        user1.setAva(1);
        user1.setElo(1200);
        user1.setWin(10);
        user1.setLose(5);
        user1.setDraw(2);

        User user2 = new User();
        user2.setIDUser("user2");
        user2.setAva(2);
        user2.setElo(1300);
        user2.setWin(8);
        user2.setLose(6);
        user2.setDraw(3);

        User user3 = new User();
        user3.setIDUser("user3");
        user3.setAva(4);
        user3.setElo(1000);
        user3.setWin(4);
        user3.setLose(6);
        user3.setDraw(6);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
    public User findUserById(String idUser){
        return userRepository.findByIDUser(idUser);
    }
}
