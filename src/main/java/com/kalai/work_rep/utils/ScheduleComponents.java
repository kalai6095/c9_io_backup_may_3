package com.kalai.work_rep.utils;

import com.kalai.work_rep.web.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ScheduleComponents {
   /* @Autowired
    ScheduleService scheduleService;
*/

    public String getConfigRefreshValue() {
        //return scheduleService.findOne("Active");
        return "";

    }
}
