package com.example.urlaliaser.controller;

import com.example.urlaliaser.model.Post;
import com.example.urlaliaser.model.PostDTO;
import com.example.urlaliaser.service.NoAliasException;
import com.example.urlaliaser.service.NonUniqueAliasException;
import com.example.urlaliaser.service.PostService;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String addPostForm(Model model) {
        model.addAttribute("newPost", new Post());
        model.addAttribute("post", new Post());
        return "index";
    }

    @PostMapping("/save-link")
    public String addPost(Model model, @ModelAttribute Post post) {
        try {
            postService.newPost(post);
            model.addAttribute("newPost", new Post());
        } catch (NonUniqueAliasException e) {
            model.addAttribute("aliasError", true);
            model.addAttribute("newPost", post);
        }
        model.addAttribute("post", post);
        return "index";
    }

    @GetMapping("/a/{alias}")
    public String redirect(Model model, @PathVariable String alias){
        try {
            String url = postService.hitUrlByAlias(alias);
            return "redirect:" + url;
        } catch (NoAliasException e) {
            throw new ResourceNotFoundException();
        }

    }

//    @GetMapping(value = "/api/links", produces = "application/json")
//    public List<PostDTO> links(HttpServletResponse response) {
//        List<Post> posts = postService.postList();
//        List<PostDTO> result = new ArrayList<>();
//        posts.forEach(p -> result.add(new PostDTO(p)));
//        response.
//        return result;
//    }

}
