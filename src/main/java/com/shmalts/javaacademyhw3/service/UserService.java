package com.shmalts.javaacademyhw3.service;

import com.shmalts.javaacademyhw3.annotation.LogRequest;
import com.shmalts.javaacademyhw3.entity.User;
import com.shmalts.javaacademyhw3.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
