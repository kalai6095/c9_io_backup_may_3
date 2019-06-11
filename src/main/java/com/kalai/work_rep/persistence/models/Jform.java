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
public class Jform implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jformid;
    @ManyToOne
    private Wcate wcate;
    private String jid;
    private String description;
    private String eng;
    private String c_id;
    private String j_is_converted;
}
