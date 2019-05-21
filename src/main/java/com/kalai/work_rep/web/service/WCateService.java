package com.kalai.work_rep.web.service;

import com.kalai.work_rep.persistence.models.Wcate;

import java.util.List;

public interface WCateService {
    void insertWcate(Wcate wcate);

    List<Wcate> getWcate();
}
