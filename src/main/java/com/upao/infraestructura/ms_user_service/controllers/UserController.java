package com.upao.infraestructura.ms_user_service.controllers;


import com.upao.infraestructura.ms_user_service.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        User user = new User(1,"Jhon", "email@email.com");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}

