package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.Cform;
import com.kalai.work_rep.persistence.repos.CRepo;
import com.kalai.work_rep.web.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CServiceImpl implements CService {
    @Autowired
    private CRepo cRepo;

    @Override
    public void insertC(Cform cform) {
        cRepo.save(cform);
    }

    @Override
    public List<Cform> getPagec() {
        return (List<Cform>) cRepo.findAll();
    }
}
