package com.example;

import com.example.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserService person = (UserService) ctx.getBean("personService");
        UserService manger = (UserService) ctx.getBean("mangerService");
        person.save("Alice");
        person.update("Alice");
        manger.save("Bob");
        manger.update("Bob");
        ctx.close();
    }
}
