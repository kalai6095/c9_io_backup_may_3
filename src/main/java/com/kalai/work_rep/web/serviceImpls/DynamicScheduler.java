package com.kalai.work_rep.web.serviceImpls;

import com.kalai.work_rep.web.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DynamicScheduler implements SchedulingConfigurer {

    @Autowired
    private ScheduleService scheduleService;

    @Bean
    public TaskScheduler poolScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("NewDynamicTask");
        scheduler.setPoolSize(1);
        scheduler.initialize();
        return scheduler;
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(poolScheduler());

        //random next execution time
        scheduledTaskRegistrar.addTriggerTask(() -> scheduleDynamically(), t -> {
            Calendar nextExeTime = new GregorianCalendar();
            Date lastActualExec = t.lastActualExecutionTime();
            nextExeTime.setTime(lastActualExec != null ? lastActualExec : new Date());
            nextExeTime.add(Calendar.SECOND, getNextExectionTime());
            return nextExeTime.getTime();
        });
        //fixed next execution time
        scheduledTaskRegistrar.addTriggerTask(() -> scheduleDynamically(), t -> {
            Calendar nextExeTime = new GregorianCalendar();
            Date lastActualExec = t.lastActualExecutionTime();
            nextExeTime.setTime(lastActualExec != null ? lastActualExec : new Date());
            nextExeTime.add(Calendar.SECOND, 8);
            return nextExeTime.getTime();
        });

        //from Database next execution time
        scheduledTaskRegistrar.addTriggerTask(() -> scheduleDynamically(), t -> {
            Calendar nextExeTime = new GregorianCalendar();
            Date lastActualExec = t.lastActualExecutionTime();
            nextExeTime.setTime(lastActualExec != null ? lastActualExec : new Date());
            nextExeTime.add(Calendar.SECOND, Integer.parseInt(scheduleService.findOne("Active")));
            return nextExeTime.getTime();
        });
        CronTrigger cronTrigger = new CronTrigger("0/10 * * * * ?");
        scheduledTaskRegistrar.addTriggerTask(() -> scheduleCron("0/10 * * * * ?"), cronTrigger);
    }

    public void scheduleCron(String cron) {
        System.out.println("scheduleCron: Next execution time of this taken from cron expression -> {}" + cron);
    }

    public void scheduleDynamically() {
        System.out.println("scheduleDynamically: Next execution time of this changes every time between 1 and 5 seconds");
    }
    public void scheduleFixed() {
        System.out.println("scheduleFixed: Next execution time of this will always be 7 seconds");
    }

    public void scheduledDatabase(String time) {
        System.out.println("scheduledDatabase: Next execution time of this will be taken from DB -> {}"+ time);
    }
}
