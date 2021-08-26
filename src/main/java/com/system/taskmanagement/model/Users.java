
package com.system.taskmanagement.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @JsonManagedReference
    @OneToMany(mappedBy = "users")
    private List<Issue> issuesOfUser;

    private String name;
    private String username;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date created_at;

    public Users(String name, String username) {
        this.name = name;
        this.username = username;
    }



}


