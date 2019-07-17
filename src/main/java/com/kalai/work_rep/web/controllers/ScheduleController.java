package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Schedule;
import com.kalai.work_rep.web.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @CrossOrigin
    @PostMapping(value = "insert/wcate")
    public ResponseEntity<String> postWcateInsert(@RequestBody Schedule schedule) {
        System.out.println("----------------------");
        System.out.println(schedule.toString());
        scheduleService.insertSchedule(schedule);
        return new ResponseEntity<String>(HttpStatus.OK);
    }


    @CrossOrigin
    @GetMapping(value = "report/wcate")
    public ResponseEntity<List<Schedule>> getListofSchedule() {
        return new ResponseEntity<List<Schedule>>(scheduleService.getSchedule(), HttpStatus.OK);
    }
}
