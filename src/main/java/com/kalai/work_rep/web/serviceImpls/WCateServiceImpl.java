package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.Wcate;
import com.kalai.work_rep.persistence.repos.WCateRepo;
import com.kalai.work_rep.web.service.WCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WCateServiceImpl implements WCateService {

    @Autowired
    private WCateRepo wcateRepo;

    @Override
    public void insertWcate(Wcate wcate) {
        wcateRepo.save(wcate);
    }

    @Override
    public List<Wcate> getWcate() {
        return (List<Wcate>) wcateRepo.findAll();
    }
}
