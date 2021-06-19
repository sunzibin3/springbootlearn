package com.sun.boot.controller;

import com.sun.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id, //可以用PathVariable获取特定值
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> pv,// 也可以用Map接受所有参数
                                     @RequestHeader("User-Agent") String agent,//@RequestHeader获取特定请求头的内容
                                     @RequestHeader Map<String,String> allHeader//获取全部Header信息
                                     ){
        HashMap<String, Object> map = new LinkedHashMap<>();
        map.put("id",id);
        map.put("username", username);
        map.put("Map-id", pv.get("id"));
        map.put("map-name", pv.get("username"));
        map.put("pv", pv);
        map.put("agent",agent );
        map.put("header_all", allHeader);
        log.info(allHeader.toString());
//        log.info(cookie.toString());
        return map;
    }

    @ResponseBody
    @PostMapping("/saveUser")
    public Person saveUser(Person person){
        log.info(person.toString());
        return person;
    }
}
