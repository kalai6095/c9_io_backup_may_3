package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.Jform;
import com.kalai.work_rep.persistence.repos.JRepo;
import com.kalai.work_rep.web.service.JService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JServiceImpl implements JService {
    @Autowired
    private JRepo jRepo;

    @Override
    public void insertJ(Jform jform) {
        jRepo.save(jform);
    }

    @Override
    public List<Jform> getPageJ() {
        return (List<Jform>) jRepo.findAll();
    }
}
