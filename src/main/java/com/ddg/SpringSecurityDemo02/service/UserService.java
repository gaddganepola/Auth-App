package com.ddg.SpringSecurityDemo02.service;

import com.ddg.SpringSecurityDemo02.model.User;
import com.ddg.SpringSecurityDemo02.model.UserPrincipal;
import com.ddg.SpringSecurityDemo02.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepo.findByUsername(username);

        if(user.isPresent()) {
            return new UserPrincipal(user.get());
        }

        throw new UsernameNotFoundException("User not found");
    }
}
