package com.example.springuserapp.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Person saved: " + name);
    }
}
