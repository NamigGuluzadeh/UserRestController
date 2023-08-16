package com.example.in28minutes17.controllers;

import com.example.in28minutes17.model.Profiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationService {

    @Autowired
    private Profiles configuration;

    @RequestMapping("/currency-configuration")
    public Profiles retrieveAllCourses() {
        return configuration;
    }
}
