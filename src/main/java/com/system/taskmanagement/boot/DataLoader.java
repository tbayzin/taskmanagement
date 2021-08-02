package com.system.taskmanagement.boot;

import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final UserService userService;


    @Override
    public void run(String... args) throws Exception {

        Users ivan = new Users();
        ivan.setName("Ivan Dragomov");
        ivan.setUsername("ivanDrago_98");


        Users katerina = new Users("katya","katya5210");

        userService.save(ivan);
        userService.save(katerina);



    }
}