package com.example.god.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.god.model.ClienteModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController 
@RequestMapping("api/v1/cliente") 

public class ClienteController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello word";
    }

    @GetMapping("/teste")
    public String testando() {
        return "TESTANDO SPRING BOOT 09/10/2026";
    }

    
    @PostMapping("/novoCliente")
    public ClienteModel novoCliente(@RequestBody ClienteModel cliente) {
        //TODO: process POST request
        
        return cliente;
    }

    @GetMapping("/cliente/(id)")
    public ClienteModel findById(@RequestParam long id) {
        return new ClienteModel(id,"Zeca Cabeça","eu é minino chupeta");
    }
    
    
    
    
    
}
