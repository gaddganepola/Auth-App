package com.ddg.SpringSecurityDemo02.repo;

import com.ddg.SpringSecurityDemo02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
