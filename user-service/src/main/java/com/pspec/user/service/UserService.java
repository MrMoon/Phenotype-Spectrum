package com.pspec.user.service;

import com.pspec.user.model.User;
import reactor.core.publisher.Mono;

public interface UserService { //TODO

    Mono<User> save(User user);

}
