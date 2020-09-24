package com.xqcao.demo.repository.other;

import com.xqcao.demo.domain.other.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
