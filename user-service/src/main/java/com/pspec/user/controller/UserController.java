package com.pspec.user.controller;

import com.pspec.user.model.User;
import com.pspec.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public Mono<User> getUserById(@PathVariable("userId") String userId) {
        //TODO
        return null;
    }

    @PostMapping("/")
    public Mono<User> createUser(@RequestBody User user) {
        //TODO
        return this.userService.save(user);
    }

    @PutMapping("/")
    public Mono<Boolean> updateUser(@RequestBody Mono<User> user) {
        //TODO
        return null;
    }

    @DeleteMapping("/{userId}")
    public Mono<Boolean> deleteUser(@PathVariable("userId") String userId) {
        //TODO
        return null;
    }

}
