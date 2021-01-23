package xyz.loveboat.reddit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.loveboat.reddit.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}