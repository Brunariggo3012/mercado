package com.senai.backend.sistema_mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.sistema_mercado.models.Mercadoria;
import com.senai.backend.sistema_mercado.services.MercadoriaServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/mercadoria")
public class MercadoriaControllers {

    @Autowired
    private MercadoriaServices mercadoriaServices;

    @PostMapping("/cadastrar")
     public Mercadoria cadastrar(@RequestBody Mercadoria mercadoria){
     return mercadoriaServices.cadastrar(mercadoria);
    }

    @GetMapping("/recuperar-por-id/{id}")
     public Mercadoria recuperarPorId(@PathVariable Integer id){
        return mercadoriaServices.recuperarPorId(id);
     }
}