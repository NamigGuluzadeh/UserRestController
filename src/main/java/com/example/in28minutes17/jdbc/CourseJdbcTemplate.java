package com.example.in28minutes17.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcTemplate {
    @Autowired
    private JdbcTemplate springJpringJdbc;
    private static String INSERT_QUERY =
            """
                insert into courses(id,name, author)
                values(1,'Learn AWS','Tim Buchalka')    
            """;
    public void insert(){
        springJpringJdbc.update(INSERT_QUERY);
    }
}
