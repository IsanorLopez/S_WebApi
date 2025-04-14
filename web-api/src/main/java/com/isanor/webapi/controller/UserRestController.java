package com.isanor.webapi.controller;


import com.isanor.webapi.constant.webApiConstant;
import com.isanor.webapi.service.IUsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("${basePath}") //Properties
public class UserRestController {

    private final IUsuarioService usuarioService;

    public UserRestController( IUsuarioService usuarioService) { this.usuarioService = usuarioService;  }

    @GetMapping("/userDetails") //Properties
    public String userDetails() {
        return usuarioService.obtenerUsuario();
    }

    @GetMapping("${endpoint}") //Properties
    public Map<String, Object> details() {

        UserDto userDto = new UserDto();

        response.put("Title", webApiConstant.MESSAGE); //Constant
        response.put("Name", "Isanor Lopez");

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
