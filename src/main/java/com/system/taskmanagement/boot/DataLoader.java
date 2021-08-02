package com.system.taskmanagement.boot;

import com.system.taskmanagement.model.Users;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {



    @Override
    public void run(String... args) throws Exception {

        Users ivan = new Users();
        ivan.setName("Ivan Dragomov");
        ivan.setUsername("ivanDrago_98");




    }
}