package com.xqcao.demo.repository.one;

import com.xqcao.demo.domain.one.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
