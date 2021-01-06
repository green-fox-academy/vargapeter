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
public class FizzBuzzWoof {

    AtomicLong atomicLong = new AtomicLong(1);

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }

    @RequestMapping("/web/fizzbuzzwoof")
    public String greeting(Model model) {
        long count = getAtomicLong().getAndIncrement();
        String result = "";
        int keyWords = 0;
        if (count % 3 == 0) {
            result = result + "Fizz";
            keyWords++;
        }
        if (count % 5 == 0) {
            result = result + "Buzz";
            keyWords++;
        }
        if (count % 7 == 0) {
            result = result + "Woof";
            keyWords++;
        }

        String stringCounter = Long.toString(count);
        if (keyWords != 0) {
            stringCounter = result;
        }

        int[] sizes = {12, 24, 48, 72};
        int fontSize = sizes[keyWords];

        model.addAttribute("counter", stringCounter);
        model.addAttribute("fontSize", fontSize);
        return "fizzbuzzwoof";
    }

}
