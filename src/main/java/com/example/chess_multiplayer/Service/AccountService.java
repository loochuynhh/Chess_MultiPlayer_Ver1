package com.example.chess_multiplayer.Service;

import com.example.chess_multiplayer.Entity.Account;
import com.example.chess_multiplayer.Entity.User;
import com.example.chess_multiplayer.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserService userService;
    public void addAccountData(){
        // Tìm User từ UserService bằng IDUser
        String idUser = "user1"; // Đặt IDUser tùy ý
        User user1 = userService.findUserById(idUser);

        if (user1 != null) {
            // Tạo mới Account và thiết lập User từ UserService
            Account account1 = new Account();
            account1.setIDUser(idUser);
            account1.setUsername("user1_username");
            account1.setPassword("user1_password");
            accountRepository.save(account1);
            account1.setUser(user1);

            // Thêm Account vào cơ sở dữ liệu

        }
        idUser = "user2"; // Đặt IDUser tùy ý
        User user2 = userService.findUserById(idUser);

        if (user2 != null) {
            // Tạo mới Account và thiết lập User từ UserService
            Account account1 = new Account();
            account1.setIDUser(idUser);
            account1.setUsername("user1_username");
            account1.setPassword("user1_password");
            accountRepository.save(account1);
            account1.setUser(user2);

            // Thêm Account vào cơ sở dữ liệu

        }
        idUser = "user1"; // Đặt IDUser tùy ý
        User user3 = userService.findUserById(idUser);

        if (user3 != null) {
            // Tạo mới Account và thiết lập User từ UserService
            Account account1 = new Account();
            account1.setIDUser(idUser);
            account1.setUsername("user1_username");
            account1.setPassword("user1_password");
            accountRepository.save(account1);
            account1.setUser(user3);

            // Thêm Account vào cơ sở dữ liệu

        }
    }
}
