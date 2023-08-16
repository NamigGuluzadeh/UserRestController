package com.example.in28minutes17.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
    jdbcTemplate.insert();
    }
}
