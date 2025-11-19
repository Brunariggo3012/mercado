package com.senai.backend.sistema_mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.sistema_mercado.models.Funcionario;
import com.senai.backend.sistema_mercado.models.Mercadoria;
import com.senai.backend.sistema_mercado.services.FuncionarioService;

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
    @GetMapping("/Listar-todos")
     public List<Funcionario> listarTodos(){
      return funcionarioService.listarTodos();
   }

    @PutMapping("/atualizar{id}")
  public Funcionario atualizar(@PathVariable Integer id, @RequestBody Funcionario funcionario){
  return funcionarioService.atualizar(id, funcionario);
  }

    @DeleteMapping("/deletar/{id}")
  public String removerPorId(@PathVariable Integer id){
   if (funcionarioService.removerPorId(id)){;
    return "Funcionario removida com sucesso!";
 }
   return "Falha ao remover a funcionario.";
} 
}