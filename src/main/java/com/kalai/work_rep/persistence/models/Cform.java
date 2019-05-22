package com.kalai.work_rep.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Cform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cformid;
    @ManyToOne
    private Wcate wcate;
    private String cid;
    private String description;
    private String eng;
    private int no_of_commits;
    private String pull_link;
}
