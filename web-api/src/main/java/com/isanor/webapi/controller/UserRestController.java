package com.isanor.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
//@RequestMapping("desarrollo/management")
@RequestMapping("${basePath}")
public class UserRestController {

    @GetMapping("${endpoint}")
    public Map<String, Object> details() {

        Map<String, Object> response = new HashMap<>();

        response.put("Title", "Spring Boot Application REST");
        response.put("Name", "Isanor Lopez");

        return response;
    }

}
