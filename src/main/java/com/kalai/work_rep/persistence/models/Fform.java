package com.kalai.work_rep.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Fform implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fformid;
    @ManyToOne
    private Wcate wcate;
    private String f_id;
    private String description;
    private String eng;
    private int no_of_commits;
    private String pull_link;
}
