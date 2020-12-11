package com.pspec.user.service;

import com.pspec.user.model.Users;
import com.pspec.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Mono<Users> createUser(Users users) {
        return this.userRepository.save(users);
    }


}
