package xyz.loveboat.reddit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.loveboat.reddit.model.Post;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByRatingDesc();
}
