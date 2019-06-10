package com.kalai.work_rep.persistence.repos;


import com.kalai.work_rep.persistence.models.Jform;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JRepo extends PagingAndSortingRepository<Jform, Long> {
}
