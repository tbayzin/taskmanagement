package com.system.taskmanagement.controller;

import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.repository.UsersRepository;
import com.system.taskmanagement.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UsersController {
    private final UsersService usersService;


    //RegisterUser
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/register")
        public Users registerUsers(@RequestBody Users users) {
        return usersService.save(users);
    }


    //GetUserById
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Users getUsersById(@PathVariable Integer id) {
        return usersService.getUsersById(id);
    }

    // getAllUsers
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Users> getAll() {
        return usersService.getAllUsers();
    }

    // DeleteUsersbyId
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteUsersById(@PathVariable Integer id) {
        usersService.deleteUsersById(id);
    }


    //UpdateUsers
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Users updateUsers(@PathVariable Integer id, @RequestBody Users users) {
        return usersService.updateUser(id, users);
    }


}
