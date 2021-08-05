package com.system.taskmanagement.boot;

import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final UsersService userService;


    @Override
    public void run(String... args) throws Exception {

        Users ivan = new Users();
        ivan.setName("Ivan Dragomov");
        ivan.setUsername("ivanDrago_98");


        Users katerina = new Users();
        katerina.setName("Katerina Anatolievna");
        katerina.setUsername("lemon-Katya");

        userService.save(ivan);
        userService.save(katerina);



    }
}