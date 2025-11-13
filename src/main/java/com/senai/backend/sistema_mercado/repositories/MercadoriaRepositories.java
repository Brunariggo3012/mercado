package com.senai.backend.sistema_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.sistema_mercado.models.Mercadoria;

@ Repository
public interface MercadoriaRepositories extends JpaRepository<Mercadoria, Integer> {
    
}
