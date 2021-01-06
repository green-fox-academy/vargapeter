package com.example.springstart.controller;

import com.example.springstart.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
