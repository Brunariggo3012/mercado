package com.senai.backend.sistema_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
} 
