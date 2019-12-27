package com.single.singletest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/single")
public class SingleController {

    private static final Logger log = LoggerFactory.getLogger(SingleController.class);

    public static String getName() {
        return log.getName();
    }

    @RequestMapping("/index")
    public String singleController(){
        log.info("single test");
        System.out.println(getName());
        return "index";
    }
}
