package com.senai.backend.sistema_mercado.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Monken mix",
        version = "1.0",
        description = " Desenvolvido por Bruna Riggo de Vasconcellos Monken"
    )
)
public class Swagger {

}