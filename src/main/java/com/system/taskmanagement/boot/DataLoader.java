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
        ivan.setPassword("123mosk_");
        ivan.setEmail("ivanzolotov@gmail.com");

        Users katerina = new Users("Katerina Anatolievna","lemon_Katya","katanatolina@gmail.com","secPass2_1");

        userService.save(ivan);
        userService.save(katerina);



    }
}