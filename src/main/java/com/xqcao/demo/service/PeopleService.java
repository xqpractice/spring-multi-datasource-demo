package com.xqcao.demo.service;

import com.xqcao.demo.domain.other.People;
import com.xqcao.demo.repository.other.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository repository;

    @Autowired
    public PeopleService(PeopleRepository repository) {
        this.repository = repository;
    }

    public People createPeople(People people) {
        return this.repository.save(people);
    }

    public List<People> getAllPeoples() {
        return this.repository.findAll();
    }

    public People findOnePeople(Long id) {
        return this.repository.findOne(id);
    }
}
