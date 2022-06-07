package com.example.login_springsecurity.service;

import com.example.login_springsecurity.model.User;
import com.example.login_springsecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}