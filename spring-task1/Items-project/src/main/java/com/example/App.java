package com.example;

import com.example.service.UserService;
import com.example.service.impl.PersonService;
import com.example.service.impl.MangerService;

public class App {
    public static void main(String[] args) {
        UserService personService = new PersonService();
        UserService managerService = new MangerService();

        // Call methods
        personService.save("Ali");
        personService.update("Ali");

        managerService.save("Sara");
        managerService.update("Sara");
    }
}
