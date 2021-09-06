package com.system.taskmanagement.service;

import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    @Autowired
   private final UsersRepository usersRepository;


    public Users save(Users users) {
        return usersRepository.save(users);
    }


    public Users getUsersById(Integer id) {
        return usersRepository.getUsersById(id);
    }


    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }


    public void deleteUsersById(Integer id) {
        usersRepository.deleteById(id);
    }

    public Users updateUser(Integer id, Users users) {
        Users savedUser = usersRepository.getUsersById(id);

        if (savedUser == null) throw new RuntimeException("User not found");

        users.setId(id);

        return usersRepository.save(users);
    }



}
