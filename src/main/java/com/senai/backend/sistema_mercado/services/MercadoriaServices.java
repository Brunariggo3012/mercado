package com.senai.backend.sistema_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.sistema_mercado.models.Mercadoria;
import com.senai.backend.sistema_mercado.repositories.MercadoriaRepositories;

@Service
public class MercadoriaServices {
    
 @Autowired
 private MercadoriaRepositories mercadoriaRepositories;

 public Mercadoria cadastrar(Mercadoria mercadoria) { 
    return mercadoriaRepositories.save(mercadoria);
 }

   public Mercadoria recuperarPorId(Integer id) {
    return mercadoriaRepositories.findById(id).get();
   }
}
