package com.xqcao.demo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class IdService {

    private static Long id = 0L;

    public Long generateId() {
        id = new AtomicLong(id).incrementAndGet();
        return id;
    }
}
