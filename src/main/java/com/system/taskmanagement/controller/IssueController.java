package com.system.taskmanagement.controller;


import com.system.taskmanagement.model.Issue;
import com.system.taskmanagement.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/issues")
public class IssueController {

    private final IssueService issueService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Issue saveProject(@RequestBody Issue issue) {
        return issueService.save(issue);
    }




}
