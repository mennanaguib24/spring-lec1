package com.example.springuserapp.config;

import com.example.springuserapp.service.AccountService;
import com.example.springuserapp.service.AccountServiceImpl;
import com.example.springuserapp.service.PersonService;
import com.example.springuserapp.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService personService() {
        return new PersonService();
    }

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl(personService());
    }
}
