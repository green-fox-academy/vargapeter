package com.example.urlaliaser.controller;

import com.example.urlaliaser.model.Post;
import com.example.urlaliaser.model.PostDTO;
import com.example.urlaliaser.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostRestController {

    private PostService postService;

    @Autowired
    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/api/links")
    public ResponseEntity<?> listAllPost() {
        List<Post> listAllPost = postService.getAllPost();
        return new ResponseEntity<>(listAllPost, HttpStatus.OK);

    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id, @RequestBody PostDTO postDTO) {
        System.out.println(postDTO);
        Optional<Post> optionalPost = postService.getPostById(id);
        if (optionalPost.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        if (postService.getPostByIdSecretCode(id, postDTO.getSecretCode()).isPresent()) {
            postService.deleteByIdAndSecretCode(id, postDTO.getSecretCode());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}

