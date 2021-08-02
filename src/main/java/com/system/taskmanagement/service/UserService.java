package com.system.taskmanagement.service;

import com.system.taskmanagement.model.Issue;
import com.system.taskmanagement.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IssueRepository issueRepository;

    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }


}
