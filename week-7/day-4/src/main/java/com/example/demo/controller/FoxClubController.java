package com.example.demo.controller;

import com.example.demo.model.Fox;
import com.example.demo.service.FoxService;
import com.example.demo.service.FoxServiceMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxClubController {

    FoxService foxService;

    @Autowired
    public FoxClubController(FoxServiceMaster foxService) {
        this.foxService = foxService;
    }


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("foxList", foxService.getFoxList());
        return "index";

    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("foxTricksList", foxService.getFoxTricks());
        return "login";

    }

    @GetMapping("/nutrition-store")
    public String nutritionStore(Model model) {
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("foodList", foxService.getDrinkList());
        return "nutrition-store";

    }

    @PostMapping("/add-fox")
    public String addFox(@ModelAttribute Fox fox) {
        foxService.addFox(fox);
        return "redirect:/";
    }

}
