package com.example.chess_multiplayer;

import Repository.DataInitializationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChessMultiplayerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChessMultiplayerApplication.class, args);
        ApplicationContext context = SpringApplication.run(ChessMultiplayerApplication.class, args);
        DataInitializationService dataInitializationService = context.getBean(DataInitializationService.class);
        dataInitializationService.initializeData();
    }

}
