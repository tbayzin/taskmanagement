package com.system.taskmanagement.repository;

import com.system.taskmanagement.model.Issue;
import com.system.taskmanagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository  extends JpaRepository <Issue,Integer> {
    Issue getIssueById(Integer id);

}
