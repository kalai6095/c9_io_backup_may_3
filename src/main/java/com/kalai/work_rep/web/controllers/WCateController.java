package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Wcate;
import com.kalai.work_rep.web.service.WCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WCateController {

    @Autowired
    private WCateService wCateService;

    @CrossOrigin
    @PostMapping(value = "insert/wcate")
    public ResponseEntity<String> postWcateInsert(@RequestBody Wcate wcate) {
        System.out.println("----------------------");
        System.out.println(wcate.toString());
        wCateService.insertWcate(wcate);
        return new ResponseEntity<String>(HttpStatus.OK);
    }


    @GetMapping(value = "report/wcate")
    public ResponseEntity<List<Wcate>> getListofWcate() {
        return new ResponseEntity<List<Wcate>>(wCateService.getWcate(), HttpStatus.OK);
    }
}
