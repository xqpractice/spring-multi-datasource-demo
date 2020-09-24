package com.xqcao.demo.config;

import com.xqcao.demo.service.IdService;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Component
public class IdGenerator implements IdentifierGenerator {

    private IdService service;

    @PostConstruct
    public void init(IdService service) {
        this.service = service;
    }

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return service.generateId();
    }
}
