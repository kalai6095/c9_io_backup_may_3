 CREATE TABLE access_control_group (
       id BIGINT NOT NULL AUTO_INCREMENT,
        group_description VARCHAR(255),
        group_name VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;
    CREATE TABLE access_control_group_roles (
       access_control_group_id BIGINT NOT NULL,
        roles_id BIGINT NOT NULL,
        PRIMARY KEY (access_control_group_id, roles_id)
    ) ENGINE=MYISAM;


    CREATE TABLE cform (
       cformid BIGINT NOT NULL AUTO_INCREMENT,
        cid VARCHAR(255),
        description VARCHAR(255),
        eng VARCHAR(255),
        no_of_commits INTEGER NOT NULL,
        pull_link VARCHAR(255),
        wcate_wcate_id BIGINT,
        PRIMARY KEY (cformid)
    ) ENGINE=MYISAM;


    CREATE TABLE fform (
       fformid BIGINT NOT NULL AUTO_INCREMENT,
        description VARCHAR(255),
        eng VARCHAR(255),
        f_id VARCHAR(255),
        no_of_commits INTEGER NOT NULL,
        pull_link VARCHAR(255),
        wcate_wcate_id BIGINT,
        PRIMARY KEY (fformid)
    ) ENGINE=MYISAM;


    CREATE TABLE jform (
       jformid BIGINT NOT NULL AUTO_INCREMENT,
        c_id VARCHAR(255),
        description VARCHAR(255),
        eng VARCHAR(255),
        j_is_converted VARCHAR(255),
        jid VARCHAR(255),
        wcate_wcate_id BIGINT,
        PRIMARY KEY (jformid)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapattribute (
       id BIGINT NOT NULL AUTO_INCREMENT,
        user_id VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapcustom_attribute (
       id BIGINT NOT NULL AUTO_INCREMENT,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapcustom_attribute_custom_ldapattributes_lables (
       ldapcustom_attribute_id BIGINT NOT NULL,
        custom_ldapattributes_lables_id BIGINT NOT NULL,
        PRIMARY KEY (ldapcustom_attribute_id, custom_ldapattributes_lables_id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapcustom_attribute_lable (
       id BIGINT NOT NULL AUTO_INCREMENT,
        attribute_name VARCHAR(255),
        attribute_value VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapdirectory_informationform (
       id BIGINT NOT NULL AUTO_INCREMENT,
        ldap_custom_filter VARCHAR(255),
        ldap_re_sync INTEGER,
        ldap_re_sync_every VARCHAR(255),
        ldap_re_sync_time DATETIME,
        ldap_sync_once BIT NOT NULL,
        ldap_user_search_base VARCHAR(255),
        ldapconfig_name VARCHAR(255),
        ldapmanager_dis_name VARCHAR(255),
        PASSWORD VARCHAR(255),
        synchronize_type VARCHAR(255),
        ldap_custom_attribute_id BIGINT,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapdirectory_informationform_access_control_groups (
       ldapdirectory_informationform_id BIGINT NOT NULL,
        access_control_groups_id BIGINT NOT NULL,
        PRIMARY KEY (ldapdirectory_informationform_id, access_control_groups_id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapdirectory_informationform_ldap_server_informations (
       ldapdirectory_informationform_id BIGINT NOT NULL,
        ldap_server_informations_id BIGINT NOT NULL,
        PRIMARY KEY (ldapdirectory_informationform_id, ldap_server_informations_id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapserver_information (
       id BIGINT NOT NULL AUTO_INCREMENT,
        hostname VARCHAR(255),
        PORT VARCHAR(255),
        use_tls BIT NOT NULL,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapserver_type (
       id BIGINT NOT NULL AUTO_INCREMENT,
        server_type VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapsynchronization_schedule (
       id BIGINT NOT NULL AUTO_INCREMENT,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE ldapsystem_configform (
       id BIGINT NOT NULL AUTO_INCREMENT,
        enable_sync VARCHAR(255),
        ldap_attribute_id BIGINT,
        ldap_server_type_id BIGINT,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE resourceform (
       id BIGINT NOT NULL AUTO_INCREMENT,
        read_permission BIT NOT NULL,
        resource_description VARCHAR(255),
        resource_name VARCHAR(255),
        update_permission BIT NOT NULL,
        view_permission BIT NOT NULL,
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE role (
       id BIGINT NOT NULL AUTO_INCREMENT,
        role_description VARCHAR(255),
        role_name VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE role_resources (
       role_id BIGINT NOT NULL,
        resources_id BIGINT NOT NULL,
        PRIMARY KEY (role_id, resources_id)
    ) ENGINE=MYISAM;


    CREATE TABLE SCHEDULE (
       id BIGINT NOT NULL AUTO_INCREMENT,
        sch VARCHAR(255),
        PRIMARY KEY (id)
    ) ENGINE=MYISAM;


    CREATE TABLE wcate (
       wcate_id BIGINT NOT NULL AUTO_INCREMENT,
        wcate VARCHAR(255),
        PRIMARY KEY (wcate_id)
    ) ENGINE=MYISAM;


    ALTER TABLE access_control_group_roles
       ADD CONSTRAINT FKk4taer8h49pevt5s2yk5rruil
       FOREIGN KEY (roles_id)
       REFERENCES role (id);


    ALTER TABLE access_control_group_roles
       ADD CONSTRAINT FKiperbchtjc7nrvqlhtno6luf6
       FOREIGN KEY (access_control_group_id)
       REFERENCES access_control_group (id);


    ALTER TABLE cform
       ADD CONSTRAINT FK97fpacpfifxnp0ylm36mjsc3q
       FOREIGN KEY (wcate_wcate_id)
       REFERENCES wcate (wcate_id);


    ALTER TABLE fform
       ADD CONSTRAINT FKq1xxh12shodr1xjytpo9d5vih
       FOREIGN KEY (wcate_wcate_id)
       REFERENCES wcate (wcate_id);


    ALTER TABLE jform
       ADD CONSTRAINT FKcx386j2il6lbsw3ltfakwgaq8
       FOREIGN KEY (wcate_wcate_id)
       REFERENCES wcate (wcate_id);


    ALTER TABLE ldapcustom_attribute_custom_ldapattributes_lables
       ADD CONSTRAINT FK6bxdsygl7piiu4xl5kb9n9hgj
       FOREIGN KEY (custom_ldapattributes_lables_id)
       REFERENCES ldapcustom_attribute_lable (id);


    ALTER TABLE ldapcustom_attribute_custom_ldapattributes_lables
       ADD CONSTRAINT FK56o7t32ysdcnb0btag0w15amb
       FOREIGN KEY (ldapcustom_attribute_id)
       REFERENCES ldapcustom_attribute (id);


    ALTER TABLE ldapdirectory_informationform
       ADD CONSTRAINT FKs4e6gdpdv1ukil25c1ddhc76u
       FOREIGN KEY (ldap_custom_attribute_id)
       REFERENCES ldapcustom_attribute (id);


    ALTER TABLE ldapdirectory_informationform_access_control_groups
       ADD CONSTRAINT FKjlywxp1lgfraokf3hoxkyavfw
       FOREIGN KEY (access_control_groups_id)
       REFERENCES access_control_group (id);


    ALTER TABLE ldapdirectory_informationform_access_control_groups
       ADD CONSTRAINT FK3b7pob8g68swx8pnoql7kydxd
       FOREIGN KEY (ldapdirectory_informationform_id)
       REFERENCES ldapdirectory_informationform (id);


    ALTER TABLE ldapdirectory_informationform_ldap_server_informations
       ADD CONSTRAINT FK86qhht5d2n8b1esyv9q43irl5
       FOREIGN KEY (ldap_server_informations_id)
       REFERENCES ldapserver_information (id);


    ALTER TABLE ldapdirectory_informationform_ldap_server_informations
       ADD CONSTRAINT FK8y75ttp9mx4n71biqes0vx59f
       FOREIGN KEY (ldapdirectory_informationform_id)
       REFERENCES ldapdirectory_informationform (id);


    ALTER TABLE ldapsystem_configform
       ADD CONSTRAINT FK3uvsl1pha2mwhm9lttefe8voe
       FOREIGN KEY (ldap_attribute_id)
       REFERENCES ldapattribute (id);


    ALTER TABLE ldapsystem_configform
       ADD CONSTRAINT FKj0q0r606xgn2okqu5hj24l5na
       FOREIGN KEY (ldap_server_type_id)
       REFERENCES ldapserver_type (id);


    ALTER TABLE role_resources
       ADD CONSTRAINT FK16gu2kybb5bbpsae2ti72odv7
       FOREIGN KEY (resources_id)
       REFERENCES resourceform (id);


    ALTER TABLE role_resources
       ADD CONSTRAINT FK7k960kk6pu1pwsk7ml4hycp53
       FOREIGN KEY (role_id)
       REFERENCES role (id);
