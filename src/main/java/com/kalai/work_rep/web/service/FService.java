package com.kalai.work_rep.web.service;

import com.kalai.work_rep.persistence.models.Fform;

import java.util.List;

public interface FService {
    void insertF(Fform fform);

    List<Fform> getPagef();
}
