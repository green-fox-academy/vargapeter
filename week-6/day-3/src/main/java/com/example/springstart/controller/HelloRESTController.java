package com.example.springstart.controller;

import com.example.springstart.model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(1 + atomicLong.getAndIncrement(), "Hello " + name + "!");

    }

}
