package com.algafood.controllers;

import ch.qos.logback.core.net.server.Client;
import com.algafood.di.AtivacaoClienteService;
import com.algafood.di.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    private AtivacaoClienteService ativacaoClienteService;

    public HelloWorld(AtivacaoClienteService ativacaoClienteService) {
        System.out.println("Controller - Hello World");
        this.ativacaoClienteService = ativacaoClienteService;
    }


    @GetMapping("/hello")
    public ResponseEntity<String> saudacoes() {

        Cliente joao = new Cliente("Joao", "joao@gamil", "2563-8589");
        ativacaoClienteService.ativar(joao);
        return ResponseEntity.ok("Hello Word - Controller");
    }




}
