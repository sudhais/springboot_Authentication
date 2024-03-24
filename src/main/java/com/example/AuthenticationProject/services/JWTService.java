package com.example.AuthenticationProject.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

    String generateToken(UserDetails userDetails);
    public String exctractUserName(String token);
    public boolean isTokenValid(String token, UserDetails userDetails);

}
