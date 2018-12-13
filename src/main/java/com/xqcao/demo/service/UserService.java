package com.xqcao.demo.service;

import com.xqcao.demo.domain.User;
import com.xqcao.demo.repository.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepositoy repositoy;

    @Autowired
    public UserService(UserRepositoy repositoy) {
        this.repositoy = repositoy;
    }

    public User createUser(User user) {
        return this.repositoy.save(user);
    }

    public List<User> getAllUsers() {
        return this.repositoy.findAll();
    }

    public User findOneUser(Long id) {
        return this.repositoy.findOne(id);
    }
}
