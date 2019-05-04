package com.djanware.springbootmongodbsecurity.repository;

import com.djanware.springbootmongodbsecurity.domain.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByRole(String role);
}