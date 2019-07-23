package com.kalai.work_rep.web.init;

import com.kalai.work_rep.persistence.models.LDAPAttribute;
import com.kalai.work_rep.persistence.models.LDAPDirectoryInformationform;
import com.kalai.work_rep.persistence.models.LDAPServerType;
import com.kalai.work_rep.persistence.models.LDAPSystemConfigform;
import com.kalai.work_rep.web.service.LDAPAttributeService;
import com.kalai.work_rep.web.service.LDAPDirectoryInformationService;
import com.kalai.work_rep.web.service.LDAPServerTypeService;
import com.kalai.work_rep.web.service.LDAPSystemConfigformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class PostInsert {


    private LDAPSystemConfigformService ldapSystemConfigformService;
    private LDAPServerTypeService ldapServerTypeService;
    private LDAPAttributeService ldapAttributeService;
    private LDAPDirectoryInformationService ldapDirectoryInformationService;

    @Autowired
    public PostInsert(LDAPSystemConfigformService ldapSystemConfigformService, LDAPServerTypeService ldapServerTypeService, LDAPAttributeService ldapAttributeService, LDAPDirectoryInformationService ldapDirectoryInformationService) {
        this.ldapSystemConfigformService = ldapSystemConfigformService;
        this.ldapServerTypeService = ldapServerTypeService;
        this.ldapAttributeService = ldapAttributeService;
        this.ldapDirectoryInformationService = ldapDirectoryInformationService;
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
        ldapDirectoryInformationform.setLdapconfig_name(System.getenv("LDAPConfigName"));
        ldapDirectoryInformationform.setLdapmanager_dis_name(System.getenv("LDAPManagerDisName"));
        ldapDirectoryInformationform.setPassword(System.getenv("LDAPPassword"));

        ldapDirectoryInformationform.setLdap_user_search_base(System.getenv("LDAPUserSearchBase"));
        ldapDirectoryInformationform.setLdap_custom_filter(System.getenv("LDAPCustomFilterforUser"));
        ldapDirectoryInformationform.setSynchronize_type(System.getenv("LDAPSynchronize"));
        ldapDirectoryInformationform.setLdap_custom_filter_for_group(System.getenv("LDAPCustomFilter"));
        ldapDirectoryInformationform.setLdap_sync_once(Boolean.getBoolean(System.getenv("LDAPSyncJustOnce")));
        ldapDirectoryInformationform.setLdap_re_sync_every(System.getenv("LDAPReSyncEvery"));
        ldapDirectoryInformationform.setLdap_re_sync(Integer.parseInt(System.getenv("LDAPReSync")));
        ldapDirectoryInformationform.setLdap_re_sync_time(new Date());

        ldapDirectoryInformationService.save(ldapDirectoryInformationform);

        System.out.println("-----------------------------------------------------");
        System.out.println(System.getenv("LDAPPassword"));
        System.out.println(ldapDirectoryInformationform.toString());
        System.out.println("------------------------------------------");


    }
}
