package com.example.in28minutes17.controllers;


import com.example.in28minutes17.model.User;
import com.example.in28minutes17.model.UserDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloController {

    private UserDao userDao;

    public HelloController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloController() {
        return "Hello world";
    }

    @GetMapping("/all-users")
    public List<User> getUsers() {
        return UserDao.getAllUsers();
    }


    @GetMapping("/all-users/{id}")
    public User getUser(@PathVariable int id) {
        return userDao.getUserByID(id);
    }

    @PostMapping("/all-users")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
        userDao.save(user);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/all-users/{id}")
    public void deleteUser(@PathVariable int id) {
         userDao.deleteUser(id);
    }
}
