package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.Fform;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FRepo extends PagingAndSortingRepository<Fform, Long> {
}
