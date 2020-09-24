package com.xqcao.demo.service;

import com.xqcao.demo.domain.one.User;
import com.xqcao.demo.repository.one.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {
        return this.repository.save(user);
    }

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    public User findOneUser(Long id) {
        return this.repository.findOne(id);
    }
}
