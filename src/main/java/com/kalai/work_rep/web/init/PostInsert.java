package com.kalai.work_rep.web.init;

import com.kalai.work_rep.persistence.models.LDAPAttribute;
import com.kalai.work_rep.persistence.models.LDAPDirectoryInformationform;
import com.kalai.work_rep.persistence.models.LDAPServerType;
import com.kalai.work_rep.persistence.models.LDAPSystemConfigform;
import com.kalai.work_rep.web.service.LDAPAttributeService;
import com.kalai.work_rep.web.service.LDAPServerTypeService;
import com.kalai.work_rep.web.service.LDAPSystemConfigformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostInsert {


    private LDAPSystemConfigformService ldapSystemConfigformService;
    private LDAPServerTypeService ldapServerTypeService;
    private LDAPAttributeService ldapAttributeService;

    @Autowired
    public PostInsert(LDAPSystemConfigformService ldapSystemConfigformService, LDAPServerTypeService ldapServerTypeService, LDAPAttributeService ldapAttributeService) {
        this.ldapSystemConfigformService = ldapSystemConfigformService;
        this.ldapServerTypeService = ldapServerTypeService;
        this.ldapAttributeService = ldapAttributeService;
    }

    @PostConstruct
    public void postInsertdata() {

        LDAPAttribute ldapAttribute = new LDAPAttribute();
        ldapAttribute.setId(1L);
        ldapAttribute.setUserId("sAMAccountName");
        ldapAttributeService.save(ldapAttribute);

        LDAPServerType serverType = new LDAPServerType();
        serverType.setId(1L);
        serverType.setServerType("Microsoft Active Directory");
        ldapServerTypeService.save(serverType);

        LDAPSystemConfigform ldapSystemConfigform = new LDAPSystemConfigform();
        ldapSystemConfigform.setEnableSync(Boolean.TRUE);
        ldapSystemConfigform.setId(1L);
        ldapSystemConfigform.setLdapAttribute(ldapAttribute);
        ldapSystemConfigform.setLdapServerType(serverType);
        ldapSystemConfigformService.save(ldapSystemConfigform);


        LDAPDirectoryInformationform ldapDirectoryInformationform = new LDAPDirectoryInformationform();
        ldapDirectoryInformationform.setId(1L);
        ldapDirectoryInformationform.setLdapconfig_name("CCIECOLLAB_AD");
        ldapDirectoryInformationform.setLdapmanager_dis_name("ldap.admin@cciecollab.com");
        ldapDirectoryInformationform.setPassword(System.getenv("LDAPPassword"));

        System.out.println("-----------------------------------------------------");
        System.out.println(System.getenv("LDAPPassword"));
        System.out.println(ldapDirectoryInformationform.toString());
        System.out.println("------------------------------------------");


    }
}
