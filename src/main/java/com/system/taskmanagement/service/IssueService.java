package com.system.taskmanagement.service;

import com.system.taskmanagement.model.Issue;
import com.system.taskmanagement.model.Users;
import com.system.taskmanagement.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class IssueService {
    private final IssueRepository issueRepository;

    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }



    public Issue getIssueById(Integer id) {
        return issueRepository.getIssueById(id);
    }


    public List<Issue> getAllIssue() {
        return issueRepository.findAll();
    }


    public void deleteIssueById(Integer id) {
        issueRepository.deleteById(id);
    }

    public Issue updateIssue(Integer id, Issue issue) {
        Issue savedIssue = issueRepository.getIssueById(id);

        if (savedIssue == null) throw new RuntimeException("User not found");

        issue.setId(id);

        return issueRepository.save(issue);
    }



}
