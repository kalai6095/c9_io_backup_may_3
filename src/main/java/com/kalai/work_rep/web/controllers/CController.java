package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Cform;
import com.kalai.work_rep.web.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {
    @Autowired
    private CService cService;

    @CrossOrigin
    @PostMapping("/insert/addc")
    public ResponseEntity<String> postWcateInsert(@RequestBody Cform cform) {
        System.out.println("----------------------");
        System.out.println(cform.toString());
        cService.insertC(cform);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
