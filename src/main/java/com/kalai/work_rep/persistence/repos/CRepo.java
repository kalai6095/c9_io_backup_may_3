package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.Cform;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CRepo extends PagingAndSortingRepository<Cform, Long> {
}
