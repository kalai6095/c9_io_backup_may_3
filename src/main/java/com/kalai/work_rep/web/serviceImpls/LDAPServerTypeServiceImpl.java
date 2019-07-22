package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.LDAPServerType;
import com.kalai.work_rep.persistence.repos.LDAPServerTypeRepo;
import com.kalai.work_rep.web.service.LDAPServerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LDAPServerTypeServiceImpl implements LDAPServerTypeService {

    @Autowired
    private LDAPServerTypeRepo ldapServerTypeRepo;

    @Override
    public void save(LDAPServerType serverType) {
        ldapServerTypeRepo.save(serverType);
    }
}
