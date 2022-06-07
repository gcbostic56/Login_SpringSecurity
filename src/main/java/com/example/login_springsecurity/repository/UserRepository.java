package com.example.login_springsecurity.repository;

import com.example.login_springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}