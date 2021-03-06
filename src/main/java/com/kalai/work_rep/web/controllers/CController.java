package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.Cform;
import com.kalai.work_rep.web.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class CController {
    Logger logger = LoggerFactory.getLogger(CController.class);

    @Autowired
    private CService cService;

    @CrossOrigin
    @PostMapping("/insert/addc")
    public ResponseEntity<String> postWcateInsert(@RequestBody Cform cform) {
        logger.info("add c in info mode");
        logger.debug("add c in debug mode");
        System.out.println("----------------------");
        System.out.println(cform.toString());
        cService.insertC(cform);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping("/page/getc")
    public ResponseEntity<List<Cform>> getJformReport() {
        System.out.println("----------------------");
        return new ResponseEntity<List<Cform>>(cService.getPagec(), HttpStatus.OK);
    }

}
