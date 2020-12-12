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
    public Mono<Users> createUser(Users user) {
        return this.userRepository.save(user);
    }

    @Override
    public Mono<Users> updateUser(Users user) {
        return this.userRepository.save(user);
    }

    @Override
    public Mono<Users> getUserById(Long userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    public Mono<Void> deleteUser(Long userId) {
        return this.userRepository.deleteById(userId);
    }


}
