package xyz.loveboat.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.loveboat.reddit.model.Post;
import xyz.loveboat.reddit.model.User;
import xyz.loveboat.reddit.repository.UserRepository;
import xyz.loveboat.reddit.service.RedditService;
import xyz.loveboat.reddit.service.UserService;

@Controller
public class RedditController {

    private RedditService redditService;
    private UserService userService;

    @Autowired
    public RedditController(RedditService redditService, UserService userService) {
        this.redditService = redditService;
        this.userService = userService;
    }

    @GetMapping(value = {"/{uid}"})
    public String landing(Model model, @PathVariable Long uid) {
        User user = userService.getUser(uid);
        model.addAttribute("postList", redditService.postList());
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping(value = {"/"})
    public String root(Model model) {
        return "redirect:/login-form";
    }

    @GetMapping("/{uid}/add-post-form")
    public String postForm(Model model, @PathVariable Long uid) {
        User user = userService.getUser(uid);
        model.addAttribute("user", user);
        return "add-post-form";
    }

    @PostMapping("/{uid}/add-post")
    public String addPost(Model model, @ModelAttribute Post post, @PathVariable Long uid) {
        User user = userService.getUser(uid);
        post.setUser(user);
        redditService.addPost(post);
        model.addAttribute("user", user);
        return "redirect:/" + uid;
    }

    @GetMapping("/{uid}/{id}/downvote")
    public String downvote(Model model, @PathVariable("id") Long id, @PathVariable Long uid) {
        User user = userService.getUser(uid);
        redditService.downvote(id);
        model.addAttribute("user", user);
        return "redirect:/" + uid;
    }

    @GetMapping("/{uid}/{id}/upvote")
    public String upvote(Model model, @PathVariable("id") Long id, @PathVariable Long uid) {
        User user = userService.getUser(uid);
        redditService.upvote(id);
        model.addAttribute("user", user);
        return "redirect:/" + uid;
    }

}
