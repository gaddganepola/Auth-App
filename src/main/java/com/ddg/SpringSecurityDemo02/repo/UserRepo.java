package com.ddg.SpringSecurityDemo02.repo;

import com.ddg.SpringSecurityDemo02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
