package com.example.library_beer.service;

import com.example.library_beer.model.User;
import com.example.library_beer.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
