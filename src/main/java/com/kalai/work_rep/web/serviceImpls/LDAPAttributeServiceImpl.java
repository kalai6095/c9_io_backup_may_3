package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.LDAPAttribute;
import com.kalai.work_rep.persistence.repos.LDAPAttributeRepo;
import com.kalai.work_rep.web.service.LDAPAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LDAPAttributeServiceImpl implements LDAPAttributeService {

    @Autowired
    private LDAPAttributeRepo ldapAttributeRepo;

    @Override
    public void save(LDAPAttribute ldapAttribute) {
        ldapAttributeRepo.save(ldapAttribute);
    }
}
