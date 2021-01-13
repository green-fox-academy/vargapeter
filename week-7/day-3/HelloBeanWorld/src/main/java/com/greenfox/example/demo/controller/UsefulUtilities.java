package com.greenfox.example.demo.controller;

import com.greenfox.example.demo.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilities {
    UtilityService utility = new UtilityService();

    @GetMapping("/useful")
    public String index() {
        return "useful";

    }

    @GetMapping("/random-color")
    public String colorpage(Model model) {
        model.addAttribute("randomColor", utility.randomColor());
        return "random-color";

    }

    @GetMapping("/random-string")
    public String stringpage(Model model) {
        model.addAttribute("randomString", utility.caesar("1", 1));
        return "useful-email";

    }
}
