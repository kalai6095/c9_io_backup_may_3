package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Jform;
import com.kalai.work_rep.web.service.JService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JController {
    @Autowired
    private JService jService;

    @CrossOrigin
    @PostMapping("/insert/addj")
    public ResponseEntity<String> postJformInsert(@RequestBody Jform jform) {
        System.out.println("----------------------");
        System.out.println(jform.toString());
        jService.insertJ(jform);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/page/getj")
    public ResponseEntity<List<Jform>> getJformReport() {
        System.out.println("----------------------");
        return new ResponseEntity<List<Jform>>(jService.getPageJ(), HttpStatus.OK);
    }
}
