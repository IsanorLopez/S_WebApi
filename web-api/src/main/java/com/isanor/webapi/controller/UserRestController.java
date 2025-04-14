package com.isanor.webapi.controller;

import com.isanor.webapi.constant.webApiConstant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("${basePath}") //Properties
public class UserRestController {

    @GetMapping("${endpoint}") //Properties
    public Map<String, Object> details() {

        Map<String, Object> response = new HashMap<>();

        response.put("Title", webApiConstant.MESSAGE); //Constant
        response.put("Name", "Isanor Lopez");

        return response;
    }

}
