package com.system.taskmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Issue {


    /*
    private IssueStatus issueStatus;
    public enum IssueStatus {
        OPEN,
        DONE;
    } */


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Users users;


    private String issueTitle;
    private String issueDetail;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String updatedOn;

}
