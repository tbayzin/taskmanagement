package com.system.taskmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String issueTitle;
    private String issueDetail;

    public Issue(String issueTitle, String issueDetail) {
        this.issueTitle = issueTitle;
        this.issueDetail = issueDetail;
    }
// private User issueOwner;

}
