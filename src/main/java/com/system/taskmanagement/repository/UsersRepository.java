package com.system.taskmanagement.repository;

import com.system.taskmanagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users,Integer> {


}
