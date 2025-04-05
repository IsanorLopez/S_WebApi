package com.isanor.webapi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        model.addAttribute("Title", "Spring Boot Application");
        model.addAttribute("Name", "Isanor Lopez");

        return "details";
    }

}
