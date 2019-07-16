package com.kalai.work_rep.persistence.repos;

import com.kalai.work_rep.persistence.models.Schedule;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ScheduleRepo extends PagingAndSortingRepository<Schedule, Long> {
}
