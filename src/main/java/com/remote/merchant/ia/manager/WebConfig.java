package com.remote.merchant.ia.manager;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

@Configuration
@PropertySource("classpath:application.properties")
public class WebConfig {

	@Bean
    public ObjectMapper configureJson() {
        return new Jackson2ObjectMapperBuilder()
                .indentOutput(true)
                .propertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE)
                .build();
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customizeJson()
    {
        return builder -> {

            builder.indentOutput(true);
            builder.propertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        };
    }
    
  
    
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customJson()
    {
        return builder -> {

            builder.indentOutput(true);
            builder.propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        };
    }
}