package xyz.loveboat.reddit.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.loveboat.reddit.model.User;
import xyz.loveboat.reddit.service.UserService;

import java.util.Optional;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login-form")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam String name, @RequestParam String password) {
        Optional<User> optionalUser = userService.getUserByCredentials(name, password);
        if (optionalUser.isPresent() == false){
            return "login-error";
        }else{
            return "redirect:/" + optionalUser.get().getId();

        }
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/login-form";
    }

    @GetMapping("/register-form")
    public String registerForm() {
        return "register";
    }

}
