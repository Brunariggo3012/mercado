package com.senai.backend.sistema_mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.senai.backend.sistema_mercado.models.Funcionario;

import com.senai.backend.sistema_mercado.repositories.FuncionarioRepositories;

@Service
public class FuncionarioService {
    
    @Autowired
 private FuncionarioRepositories funcionarioRepositories;

 public Funcionario cadastrar(Funcionario funcionario) { 
    return funcionarioRepositories.save(funcionario);
 }

   public Funcionario recuperarPorId(Integer id) {
    return funcionarioRepositories.findById(id).get();
   }
   
   public List<Funcionario> listarTodos(){
      return funcionarioRepositories.findAll();
   }

   public Funcionario atualizar(Integer id, Funcionario funcionario){
      Funcionario fun = funcionarioRepositories.findById(id).get();
      if(fun != null) {
      funcionario.setId(fun.getId());
     return funcionarioRepositories.save(funcionario);
      }
      return null;
   }

   public boolean removerPorId(Integer id){
      Funcionario fun = funcionarioRepositories.findById(id).get();
      if(fun != null) {
         funcionarioRepositories.deleteById(id);
         return true;         
   }
   return false;
 }
} 
