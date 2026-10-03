package com.example.patientdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration 
public class OpenApiConfig {
    
    @Bean
    public OpenAPI patientDataOpenApi() {

        return new OpenAPI()
                .info(new Info()
                        .title("Patient Data API")
                        .description("REST API for managing patient data information")
                        .version("1.0.0"));
    }
}