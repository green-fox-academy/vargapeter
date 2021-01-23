package xyz.loveboat.reddit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.loveboat.reddit.model.Post;
import xyz.loveboat.reddit.model.User;
import xyz.loveboat.reddit.service.RedditService;
import xyz.loveboat.reddit.service.UserService;

@Controller
public class RedditController {

    private RedditService redditService;
    private UserService userService;


    @Autowired
    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    public RedditController(UserService userService) { this.userService = userService;
    }

    @GetMapping(value = {"/"})
    public String landing(Model model) {
        model.addAttribute("postList", redditService.postList());
        return "index";
    }

    @GetMapping("/add-post-form")
    public String postForm() {
        return "add-post-form";
    }

    @PostMapping("/add-post")
    public String addPost(@ModelAttribute Post post, User user){
        redditService.addPost(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String downvote(@PathVariable("id") Long id){
        Post downvoted = redditService.downvote(id);
        redditService.addPost(downvoted);
        return "redirect:/";
    }

    @GetMapping("/{id}/upvote")
    public String upvote(@PathVariable("id") Long id){
        Post upvoted = redditService.upvote(id);
        redditService.addPost(upvoted);
        return "redirect:/";
    }

}
