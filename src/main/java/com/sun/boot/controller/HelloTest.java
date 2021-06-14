package com.sun.boot.controller;

import com.sun.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //日志功能
@RestController
public class HelloTest {

    @Autowired
    Person person;
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name)
    {
        log.info("请求进来了");
        return "Hello World"+name;
    }
    @RequestMapping("/hellos")
    public Person hello()
    {
        log.info("请求进来了");
        System.out.println(person.getUserName());
        return person;
    }
}
