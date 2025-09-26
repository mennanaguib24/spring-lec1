package com.example.springuserapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final UserService personService;

    @Autowired
    public AccountServiceImpl(UserService personService) {
        this.personService = personService;
    }

    @Override
    public void getSavePerson(String name) {
        personService.save(name);
    }
}
