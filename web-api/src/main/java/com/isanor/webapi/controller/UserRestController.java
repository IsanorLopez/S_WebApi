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

        Map<String, Object> response = new HashMap<>();

        response.put("Title", webApiConstant.MESSAGE); //Constant
        response.put("Name", "Isanor Lopez");

        return response;
    }

}
