package com.xqcao.demo.repository;

import com.xqcao.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoy extends JpaRepository<User, Long> {
}
