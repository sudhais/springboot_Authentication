package com.example.AuthenticationProject.repositories;

import com.example.AuthenticationProject.models.Role;
import com.example.AuthenticationProject.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findUserByEmail(String email);

    User findUserByRole(Role role);
}
