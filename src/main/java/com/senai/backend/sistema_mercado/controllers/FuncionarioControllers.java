package com.senai.backend.sistema_mercado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.sistema_mercado.models.Funcionario;
import com.senai.backend.sistema_mercado.services.FuncionarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControllers {

    @Autowired 
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastrar")
     public Funcionario cadastrar(@RequestBody Funcionario funcionario){
     return funcionarioService.cadastrar(funcionario);
    }

    @GetMapping("/recuperar-por-id/{id}")
     public Funcionario recuperarPorId(@PathVariable Integer id){
        return funcionarioService.recuperarPorId(id);
     }
}
