package com.isanor.webapi.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.isanor.webapi.dto.UsuarioDTO;
import com.isanor.webapi.service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private final ObjectMapper objectMapper;

    public UsuarioServiceImpl(ObjectMapper objectMapper) {this.objectMapper = objectMapper;}
    public static final Logger LOGGER = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Override
    public String obtenerUsuario() {
        try {
            UsuarioDTO usuarioDTO = new UsuarioDTO();

            usuarioDTO.setName("Isanor");
            usuarioDTO.setPassword("123456");
            usuarioDTO.setAge(18);

            return objectMapper.writeValueAsString(usuarioDTO);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
            LOGGER.error("Error obtenerUsuario", e.getMessage());

            return e.getMessage();
        }
    }
}
