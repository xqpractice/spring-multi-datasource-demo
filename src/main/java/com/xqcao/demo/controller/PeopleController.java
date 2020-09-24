package com.xqcao.demo.controller;

import com.xqcao.demo.domain.other.People;
import com.xqcao.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peoples")
public class PeopleController {
    private final PeopleService service;

    @Autowired
    public PeopleController(PeopleService service) {
        this.service = service;
    }

    @GetMapping
    public List<People> fetchAll() {
        return this.service.getAllPeoples();
    }

    @GetMapping("/{id}")
    public People fetch(@PathVariable("id") Long id) {
        return this.service.findOnePeople(id);
    }

    @PostMapping
    public People create(@RequestBody People people) {
        return this.service.createPeople(people);
    }
}
