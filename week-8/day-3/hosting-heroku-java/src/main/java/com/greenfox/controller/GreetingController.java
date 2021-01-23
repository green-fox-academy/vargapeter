package com.greenfox.controller;

import com.greenfox.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingController {

    AtomicLong atomicLong = new AtomicLong();

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name ) {
        model.addAttribute("name", name);
        model.addAttribute("counter", 1 + getAtomicLong().getAndIncrement());
        return "greeting";
    }

}

