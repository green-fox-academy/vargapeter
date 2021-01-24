package xyz.loveboat.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.loveboat.reddit.model.User;
import xyz.loveboat.reddit.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Long uid) {
        System.out.println(userRepository);
        User user = userRepository.findById(uid).get();
        return user;
    }

    public Optional<User> getUserByCredentials(String name, String password){
        return userRepository.findByNameAndPassword(name, password);
    }

}
