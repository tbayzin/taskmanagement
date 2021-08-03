package com.system.taskmanagement.repository;

import com.system.taskmanagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <Users,Integer> {
    Users getUsersById(Integer id);

}
