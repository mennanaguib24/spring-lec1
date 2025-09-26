package com.example;

import com.example.config.AppConfig;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfigApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService person = (UserService) ctx.getBean("personService");
        UserService manger = (UserService) ctx.getBean("mangerService");
        person.save("Alice");
        person.update("Alice");
        manger.save("Bob");
        manger.update("Bob");
        ctx.close();
    }
}
