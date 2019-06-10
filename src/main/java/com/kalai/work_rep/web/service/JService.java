package com.kalai.work_rep.web.service;

import com.kalai.work_rep.persistence.models.Jform;

import java.util.List;

public interface JService {
    void insertJ(Jform jform);

    List<Jform> getPageJ();
}
