package com.kalai.work_rep;

import com.kalai.work_rep.persistence.models.Schedule;

import com.kalai.work_rep.web.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DynamicDbSchdule {

    @Autowired
    ScheduleService scheduleService;

    @Bean(name = "getConfigRefreshValue")
    public String getConfigRefreshValue() {
        Schedule schedule=new Schedule();
        schedule.setId(1L);
        schedule.setSch("0 0 0 1 0 0");
        //scheduleService.insertSchedule(schedule);
        //return scheduleService.findOne("Active");
        return "10";
    }

    //@Scheduled(cron = "* * * ? * *")
    @Scheduled(fixedRateString = "#{@getConfigRefreshValue}")
    public void scheduleTaskUsingCronExpression() {

        long now = System.currentTimeMillis() / 1000;
        System.out.println("schedule tasks using cron jobs - " + now);
    }
}
