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
    public void addAccountData() {
        try {
            // Tìm User từ UserService bằng IDUser
            String idUser1 = "user1"; // Đặt IDUser tùy ý
            User user1 = userService.findUserById(idUser1);

            if (user1 != null) {
                // Tạo mới Account và thiết lập User từ UserService
                Account account1 = new Account();
                account1.setIDUser(idUser1);
                account1.setUsername("user1_username");
                account1.setPassword("user1_password");

                // Thiết lập liên kết 1-1 giữa User và Account
                user1.setAccount(account1);
                account1.setUser(user1);

                accountRepository.save(account1); // Lưu Account vào cơ sở dữ liệu
            }

            String idUser2 = "user2"; // Đặt IDUser tùy ý
            User user2 = userService.findUserById(idUser2);

            if (user2 != null) {
                // Tạo mới Account và thiết lập User từ UserService
                Account account2 = new Account();
                account2.setIDUser(idUser2);
                account2.setUsername("user2_username");
                account2.setPassword("user2_password");

                // Thiết lập liên kết 1-1 giữa User và Account
                user2.setAccount(account2);
                account2.setUser(user2);

                accountRepository.save(account2); // Lưu Account vào cơ sở dữ liệu
            }

            String idUser3 = "user3"; // Đặt IDUser tùy ý
            User user3 = userService.findUserById(idUser3);

            if (user3 != null) {
                // Tạo mới Account và thiết lập User từ UserService
                Account account3 = new Account();
                account3.setIDUser(idUser3);
                account3.setUsername("user3_username");
                account3.setPassword("user3_password");

                // Thiết lập liên kết 1-1 giữa User và Account
                user3.setAccount(account3);
                account3.setUser(user3);

                accountRepository.save(account3); // Lưu Account vào cơ sở dữ liệu
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
