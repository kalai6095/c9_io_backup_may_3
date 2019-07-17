package com.kalai.work_rep.web.service;

import com.kalai.work_rep.persistence.models.Schedule;

import java.util.List;

public interface ScheduleService {

    void insertSchedule(Schedule schedule);

    List<Schedule> getSchedule();

    String findOne(String active);
}
