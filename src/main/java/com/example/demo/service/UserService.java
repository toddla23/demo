package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.dto.user.UserRequest;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(UserRequest userRequest){
        User user = userRequest.toEntity();
        userRepository.save(user);
        return user;
    }
}
