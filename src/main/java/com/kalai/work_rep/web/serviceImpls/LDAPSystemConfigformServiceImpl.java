package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.LDAPSystemConfigform;
import com.kalai.work_rep.persistence.repos.LDAPSystemConfigformRepo;
import com.kalai.work_rep.web.service.LDAPSystemConfigformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LDAPSystemConfigformServiceImpl implements LDAPSystemConfigformService {


    @Autowired
    private LDAPSystemConfigformRepo ldapSystemConfigformRepo;

    @Override
    public void save(LDAPSystemConfigform ldapSystemConfigform) {
        ldapSystemConfigformRepo.save(ldapSystemConfigform);
    }
}
