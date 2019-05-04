package com.djanware.springbootmongodbsecurity.repository;

import com.djanware.springbootmongodbsecurity.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}