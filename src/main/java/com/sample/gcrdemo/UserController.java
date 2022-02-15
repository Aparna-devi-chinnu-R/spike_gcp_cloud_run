package com.sample.gcrdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> allUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/api/users")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
