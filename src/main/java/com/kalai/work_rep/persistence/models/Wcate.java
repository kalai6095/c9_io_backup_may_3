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
public class Wcate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wcateId;
    private String wcate;
}
