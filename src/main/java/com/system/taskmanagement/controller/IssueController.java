package com.system.taskmanagement.controller;

import com.system.taskmanagement.model.Issue;
import com.system.taskmanagement.service.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/issues")
public class IssueController {

    private final IssueService issueService;

    //saveIssue
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Issue saveIssue(@RequestBody Issue issue) {
        return issueService.save(issue);
    }

    //GetIssueById
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Issue getIssueById(@PathVariable Integer id) {
        return issueService.getIssueById(id);
    }

    //GetIssueByTitle
    @RequestMapping(value = "/find/{issueTitle}", method = RequestMethod.GET)
    @ResponseBody
    public Issue getIssueByIssueTitle(@PathVariable String issueTitle) {
        return issueService.getIssueByIssueTitle(issueTitle);
    }

    // getAllIssues
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Issue> getAll() {
        return issueService.getAllIssue();
    }

    // DeleteIssueById
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteIssueById(@PathVariable Integer id) {
        issueService.deleteIssueById(id);
    }

    //updateIssue
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Issue updateIssue(@PathVariable Integer id, @RequestBody Issue issue) {
        return issueService.updateIssue(id, issue);
    }
}
