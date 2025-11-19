package com.senai.backend.sistema_mercado.services;

import java.util.List;

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

   public List<Mercadoria> listarTodos(){
      return mercadoriaRepositories.findAll();
   }

   public Mercadoria atualizar(Integer id, Mercadoria mercadoria){
      Mercadoria merc = mercadoriaRepositories.findById(id).get();
      if(merc != null) {
      mercadoria.setId(merc.getId());
     return mercadoriaRepositories.save(mercadoria);
      }
      return null;
   }

   public boolean removerPorId(Integer id){
      Mercadoria merc = mercadoriaRepositories.findById(id).get();
      if(merc != null) {
         mercadoriaRepositories.deleteById(id);
         return true;         
   }
   return false;
 }
}
