package com.pspec.user.api;

import com.pspec.user.model.Users;
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
    public Mono<Users> getUserById(@PathVariable("userId") String userId) {
        return this.userService.getUserById(Long.parseLong(userId));
    }

    @PostMapping("/")
    public Mono<Users> createUser(@RequestBody Users user) {
        return this.userService.createUser(user);
    }

    @PutMapping("/")
    public Mono<Users> updateUser(@RequestBody Users user) {
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public Mono<Void> deleteUser(@PathVariable("userId") String userId) {
        return this.userService.deleteUser(Long.parseLong(userId));
    }

}
