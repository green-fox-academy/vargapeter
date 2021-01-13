package com.greenfox.example.demo.controller;

import com.greenfox.example.demo.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Pattern;

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

    @GetMapping("/useful/email")
    public String stringpage(Model model, @RequestParam String email) {
        boolean isValid = Pattern.matches("^[a-z-0-9-]+@[a-z][a-z-0-9-]+(\\.[a-z-0-9-]+)+$", email);
        model.addAttribute("valid", isValid);
        model.addAttribute("email", email);
        return "useful-email";

    }


}
