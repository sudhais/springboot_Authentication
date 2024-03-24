package com.example.AuthenticationProject.services;

import com.example.AuthenticationProject.dto.SignUpRequest;
import com.example.AuthenticationProject.models.User;

public interface AuthenticationService {

    public User signUp(SignUpRequest signUpRequest);
}
