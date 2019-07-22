package com.kalai.work_rep.persistence.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class LDAPDirectoryInformationform implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ldapconfig_name;
    private String ldapmanager_dis_name;
    private String password;
    private String ldap_user_search_base;
    private String ldap_custom_filter;
    private String synchronize_type;
    private boolean ldap_sync_once;
    private Integer ldap_re_sync;
    private String ldap_re_sync_every;
    private Date ldap_re_sync_time;

    @ManyToMany(cascade =  CascadeType.ALL)
    private Set<AccessControlGroup> accessControlGroups;
    @ManyToMany(cascade =  CascadeType.ALL)
    private Set<LDAPServerInformation> ldapServerInformations;

    @ManyToOne
    private LDAPCustomAttribute ldapCustomAttribute;

}
