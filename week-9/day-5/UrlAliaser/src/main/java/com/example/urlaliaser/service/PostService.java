package com.example.urlaliaser.service;

import com.example.urlaliaser.model.Post;
import com.example.urlaliaser.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> postList() {
        List<Post> result = new ArrayList<>();
        postRepository.findAll().forEach(e -> result.add(e));
        return result;
    }

    public void newPost(Post post) throws NonUniqueAliasException {
        try {
            postRepository.save(post);
        } catch (DataIntegrityViolationException e) {
            throw new NonUniqueAliasException(e);
        }
    }

    public String hitUrlByAlias(String alias) throws NoAliasException {
        Optional<Post> optionalPost = postRepository.findByAlias(alias);
        if (!optionalPost.isPresent()) {
            throw new NoAliasException();
        } else {
            Post post = optionalPost.get();
            post.setHitCount(post.getHitCount() + 1);
            postRepository.save(post);
            return post.getUrl();
        }
    }

    public List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Optional<Post> getPostBySecretCode(String secretCode) {
        return postRepository.findBySecretCode(secretCode);
    }

    public Optional<Post> getPostByIdSecretCode(Long id, String secretCode) {
        return postRepository.findByIdAndSecretCode(id, secretCode);
    }

    public Optional<Post> deletePostById(Long id) {
        return postRepository.deleteById(id);
    }

    public Optional<Post> deleteByIdAndSecretCode(Long id, String secretCode) {
        return postRepository.deleteByIdAndSecretCode(id, secretCode);

    }

}