package com.ddg.SpringSecurityDemo02.service;

import com.ddg.SpringSecurityDemo02.model.User;
import com.ddg.SpringSecurityDemo02.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
