package com.system.taskmanagement.service;

import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

   private final UsersRepository usersRepository;


    public Users save(Users users) {
        return usersRepository.save(users);
    }


}
