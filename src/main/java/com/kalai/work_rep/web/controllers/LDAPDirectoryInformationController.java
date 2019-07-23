package com.kalai.work_rep.web.controllers;

import com.kalai.work_rep.persistence.models.LDAPDirectoryInformationform;
import com.kalai.work_rep.web.service.LDAPDirectoryInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LDAPDirectoryInformationController {


    @Autowired
    private LDAPDirectoryInformationService ldapDirectoryInformationService;

    @PostMapping(value = "/insert/ldapinfo")
    public void insertLDAPDirectoryInformation(@RequestBody LDAPDirectoryInformationform ldapDirectoryInformationform) {

        ldapDirectoryInformationService.save(ldapDirectoryInformationform);
    }

}
