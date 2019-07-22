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
public class LDAPSystemConfigform implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enableSync;
    @ManyToOne
    private LDAPServerType ldapServerType;
    @ManyToOne
    private LDAPAttribute ldapAttribute;
}
