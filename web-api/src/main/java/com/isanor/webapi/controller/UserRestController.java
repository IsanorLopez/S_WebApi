package com.isanor.webapi.controller;

import com.isanor.webapi.models.User;
import com.isanor.webapi.models.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/user")
    public UserDto details() {

        UserDto userDto = new UserDto();

        String title = "Spring Boot REST API";
        User user = new User("Isanor", "Lopez", "isanor@isanor.com");

        userDto.setTitle(title);
        userDto.setUser(user);

        return userDto;
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        user.setName("Isanor");

        return user;

    }

    @GetMapping("/user/list")
    public List<User> listDetails() {

        User user1 = new User("IsanorX", "Lopez", "isanor@isanor.com");
        User user2 = new User("Alejandro", "Molina", "alejandro@isanor.com");
        User user3 = new User("Carlos", "Hernandez", "carlos@isanor.com");

        return Arrays.asList(user1, user2, user3);
    }

}
