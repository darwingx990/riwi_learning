package com.riwi.learning.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Api to manage the Spring Boot Drill",
        version = "1.0",
        description = "EndPoint documentation of the spring boot drill application"
    )
)
public class OpenApiCongiguration {
    
}
