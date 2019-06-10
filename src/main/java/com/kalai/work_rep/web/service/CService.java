package com.kalai.work_rep.web.service;

import com.kalai.work_rep.persistence.models.Cform;

import java.util.List;

public interface CService {
    void insertC(Cform cform);

    List<Cform> getPagec();
}
