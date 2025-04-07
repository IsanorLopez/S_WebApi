package com.isanor.webapi.controller;

import com.isanor.webapi.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {

        User user = new User("Isanor", "Lopez", "isanor@isanor.com");

        Map<String, Object> response = new HashMap<>();

        response.put("Title", "Spring Boot Application");
        response.put("User", user);

        return response;
    }

}
