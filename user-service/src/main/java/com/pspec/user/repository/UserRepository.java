package com.pspec.user.repository;

import com.pspec.user.model.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<Users, Long> {

}
