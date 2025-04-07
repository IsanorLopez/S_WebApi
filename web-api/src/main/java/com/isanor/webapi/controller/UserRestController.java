package com.isanor.webapi.controller;

import com.isanor.webapi.models.User;
import com.isanor.webapi.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();

        String title = "Spring Boot REST API";
        User user = new User("Isanor", "Lopez", "isanor@isanor.com");

        userDto.setTitle(title);
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/details/list")
    public List<User> listDetails() {

        User user1 = new User("IsanorX", "Lopez", "isanor@isanor.com");
        User user2 = new User("Alejandro", "Molina", "alejandro@isanor.com");
        User user3 = new User("Carlos", "Hernandez", "carlos@isanor.com");

        //List<User> users = new ArrayList<>();

        //users.add(user1);
        //users.add(user2);
        //users.add(user3);

        return Arrays.asList(user1, user2, user3);
    }

}
