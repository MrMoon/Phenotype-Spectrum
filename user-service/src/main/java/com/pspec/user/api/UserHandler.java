package com.pspec.user.api;

import com.pspec.user.model.Users;
import com.pspec.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class UserHandler {

    private final UserService userService;

    public @NotNull Mono<ServerResponse> createUser(@NotNull ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Users.class).flatMap(user -> ServerResponse
                                                        .status(HttpStatus.CREATED)
                                                        .contentType(MediaType.APPLICATION_JSON)
                                                        .body(userService.createUser(user) , Users.class));
    }

    public @NotNull Mono<ServerResponse> updateUser(@NotNull ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Users.class).flatMap(user -> ServerResponse
                                                        .status(HttpStatus.CREATED)
                                                        .contentType(MediaType.APPLICATION_JSON)
                                                        .body(userService.updateUser(user) , Users.class));
    }

    public @NotNull Mono<ServerResponse> getUserById(@NotNull ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Long.class).flatMap(userId -> ServerResponse
                                                        .status(HttpStatus.ACCEPTED)
                                                        .contentType(MediaType.APPLICATION_JSON)
                                                        .body(userService.getUserById(userId) , Users.class));
    }

    public @NotNull Mono<ServerResponse> deleteUserById(@NotNull ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Long.class).flatMap(userId -> ServerResponse
                                                        .status(HttpStatus.ACCEPTED)
                                                        .contentType(MediaType.APPLICATION_JSON)
                                                        .body(this.userService.deleteUser(userId) , Void.class));
    }


}
