package com.sun.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class RequestController {
    @RequestMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("name", "sun");
        request.setAttribute("code", 12);
        log.info("into");
        return "forward:/success";
    }

    @ResponseBody
    @RequestMapping("/success")
    public Map success(@RequestAttribute("name") String name, @RequestAttribute("code") Integer code,HttpServletRequest request){

        HashMap<Object, Object> map = new HashMap<>();
        map.put("sun", name);
        map.put("code", code);
        return map;
    }
}
