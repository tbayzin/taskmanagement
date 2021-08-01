package com.system.taskmanagement.repository;

import com.system.taskmanagement.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository  extends JpaRepository <Issue,Integer> {


}
