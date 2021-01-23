package xyz.loveboat.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.loveboat.reddit.model.User;
import xyz.loveboat.reddit.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService;}

    @GetMapping(value = {"login"})
    public String login(){
        return "login";
    }


    @PostMapping("/add-user")
    public String addUser(@ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/";
    }



}
