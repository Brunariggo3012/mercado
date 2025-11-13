package com.senai.backend.sistema_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.sistema_mercado.models.Funcionario;

@Repository
public interface FuncionarioRepositories extends JpaRepository<Funcionario, Integer> {
    
}
