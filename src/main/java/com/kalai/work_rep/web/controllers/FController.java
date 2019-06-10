package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Fform;
import com.kalai.work_rep.web.service.FService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FController {
    @Autowired
    private FService fService;

    @CrossOrigin
    @PostMapping("/insert/addf")
    public ResponseEntity<String> postfFormInsert(@RequestBody Fform fform) {
        System.out.println("----------------------");
        System.out.println(fform.toString());
        fService.insertF(fform);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/page/getf")
    public ResponseEntity<List<Fform>> getJformReport() {
        System.out.println("----------------------");
        return new ResponseEntity<List<Fform>>(fService.getPagef(), HttpStatus.OK);
    }
}
