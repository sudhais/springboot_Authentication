package com.example.AuthenticationProject.services.impl;

import com.example.AuthenticationProject.repositories.UserRepository;
import com.example.AuthenticationProject.dto.SignUpRequest;
import com.example.AuthenticationProject.models.User;
import com.example.AuthenticationProject.models.Role;
import com.example.AuthenticationProject.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signUp(SignUpRequest signUpRequest){
        User user = new User();
        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setRole(Role.USER);
        System.out.println(user);

        return userRepository.save(user);
    }
}
