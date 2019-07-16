package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.persistence.models.Schedule;
import com.kalai.work_rep.persistence.repos.ScheduleRepo;
import com.kalai.work_rep.web.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepo scheduleRepo;

    @Override
    public void insertSchedule(Schedule schedule) {
        scheduleRepo.save(schedule);
    }

    @Override
    public List<Schedule> getSchedule() {
        return (List<Schedule>) scheduleRepo.findAll();
    }

    @Override
    public String findOne(String active) {
       Optional<Schedule> schedule= scheduleRepo.findById(1L);
        return schedule.get().getSch();//getSch();
    }
}
