package com.isanor.webapi.controller;

import com.isanor.webapi.models.User;
import com.isanor.webapi.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

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

}
