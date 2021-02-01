package com.example.urlaliaser.repository;

import com.example.urlaliaser.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, String> {
    Optional<Post> findByAlias(String alias);

    Optional<Post> findById(Long id);
    Optional<Post> findBySecretCode(String secretCode);
    Optional<Post> findByIdAndSecretCode(Long id, String secretCode);

    @Transactional
    Optional<Post> deleteById(Long id);

    @Transactional
    Optional<Post> deleteByIdAndSecretCode(Long id, String secretCode);

}
