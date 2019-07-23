package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.LDAPDirectoryInformationform;
import com.kalai.work_rep.persistence.repos.LDAPDirectoryInformationformRepo;
import com.kalai.work_rep.web.service.LDAPDirectoryInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LDAPDirectoryInformationServiceImpl implements LDAPDirectoryInformationService {

    @Autowired
    private LDAPDirectoryInformationformRepo ldapDirectoryInformationformRepo;

    @Override
    public void save(LDAPDirectoryInformationform ldapDirectoryInformationform) {
        ldapDirectoryInformationformRepo.save(ldapDirectoryInformationform);
    }
}
