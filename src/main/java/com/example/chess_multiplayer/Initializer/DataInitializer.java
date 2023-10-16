package com.example.chess_multiplayer.Initializer;


import com.example.chess_multiplayer.Service.AccountService;
import com.example.chess_multiplayer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationRunner {
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Nạp Data");
        userService.addUserData();
        accountService.addAccountData();
        System.out.println("Kết thúc nạp");
    }
}
