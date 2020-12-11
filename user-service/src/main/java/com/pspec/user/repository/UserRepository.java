package com.pspec.user.repository;

import com.pspec.user.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User , String> {

}
