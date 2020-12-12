package com.pspec.user.service;

import com.pspec.user.model.Users;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<Users> createUser(Users users);
    Mono<Users> updateUser(Users users);
    Mono<Users> getUserById(Long userId);
    Mono<Void> deleteUser(Long userId);

}
