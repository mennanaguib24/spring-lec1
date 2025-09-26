package com.example.springuserapp;

import com.example.springuserapp.config.AppConfig;
import com.example.springuserapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        AccountService accountService = context.getBean(AccountService.class);

        accountService.getSavePerson("Menna");
    }
}
