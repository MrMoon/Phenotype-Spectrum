package com.pspec.user.service;

import com.pspec.user.model.Users;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<Users> createUser(Users users);

}
