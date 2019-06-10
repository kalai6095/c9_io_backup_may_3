package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.Fform;
import com.kalai.work_rep.persistence.repos.FRepo;
import com.kalai.work_rep.web.service.FService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FServiceImpl implements FService {

    @Autowired
    private FRepo fRepo;

    @Override
    public void insertF(Fform fform) {
        fRepo.save(fform);
    }

    @Override
    public List<Fform> getPagef() {
        return (List<Fform>) fRepo.findAll();
    }
}
