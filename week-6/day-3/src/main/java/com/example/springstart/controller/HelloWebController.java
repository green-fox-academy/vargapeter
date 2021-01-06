package com.example.springstart.controller;

import com.example.springstart.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong atomicLong = new AtomicLong();

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }
    @RequestMapping("/web/greeting")
//    public String greeting(Model model) {
//        model.addAttribute("name", " World");
//        return "greeting";
//    }
    public String greeting(Model model, @RequestParam String name ) {
        model.addAttribute("name", name);
        model.addAttribute("counter", 0 + getAtomicLong().getAndIncrement());
        return "greeting";
    }

}
