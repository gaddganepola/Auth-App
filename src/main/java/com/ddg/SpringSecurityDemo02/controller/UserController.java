package com.ddg.SpringSecurityDemo02.controller;

import com.ddg.SpringSecurityDemo02.model.User;
import com.ddg.SpringSecurityDemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return  new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
