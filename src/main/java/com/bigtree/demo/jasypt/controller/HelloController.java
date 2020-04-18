package com.bigtree.demo.jasypt.controller;

import java.time.Clock;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello Jasypt";
    }

    @RequestMapping("/date")
    public String date() {
        return "Hello Jasypt. Today is: "+ LocalDate.now(Clock.systemDefaultZone());
    }

}