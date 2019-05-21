package com.kalai.work_rep.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    /*
     *
     *
     * we can disable the favicons using below method and property on
     * spring.mvc.favicon.enabled=false
     * or
     * simply placing file in this location also will help
     * src/main/resources/static/favicon.ico.
     * */
   /* @GetMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {

    }*/
}
