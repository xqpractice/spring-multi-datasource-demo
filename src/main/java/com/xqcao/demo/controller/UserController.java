package com.xqcao.demo.controller;

import com.xqcao.demo.domain.User;
import com.xqcao.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> fetchAll() {
        return this.service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User fetch(@PathVariable("id") Long id) {
        return this.service.findOneUser(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return this.service.createUser(user);
    }
}
