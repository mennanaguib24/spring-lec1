package com.example.config;

import com.example.service.UserService;
import com.example.service.impl.PersonService;
import com.example.service.impl.MangerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserService personService() {
        return new PersonService();
    }
    @Bean
    public UserService mangerService() {
        return new MangerService();
    }
}
