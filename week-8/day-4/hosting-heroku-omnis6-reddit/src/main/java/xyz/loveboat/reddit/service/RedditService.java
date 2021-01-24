package xyz.loveboat.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.loveboat.reddit.model.Post;
import xyz.loveboat.reddit.model.Post;
import xyz.loveboat.reddit.repository.RedditRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RedditService {

    private RedditRepository redditRepository;

    @Autowired
    public RedditService(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }


    public List<Post> postList() {
        //List<Post> allPost = (List<Post>) redditRepository.findAll();
        //List<Post> orderedPost = allPost.stream().sorted(Comparator.comparing(Post::getRating).reversed()).collect(Collectors.toList());
        List<Post>orderedPost = redditRepository.findAllByOrderByRatingDesc();
        return orderedPost;
    }

    public void addPost(Post post) {
        redditRepository.save(post);
    }

    public void downvote(Long id) {
        Optional<Post> optionalPost = redditRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post updatePost = optionalPost.get();
            updatePost.setRating(updatePost.getRating() - 1);
            redditRepository.save(updatePost);
        }
    }

    public void upvote(Long id) {
        Optional<Post> optionalPost = redditRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post updatePost = optionalPost.get();
            updatePost.setRating(updatePost.getRating() + 1);
            redditRepository.save(updatePost);
        }
    }

}