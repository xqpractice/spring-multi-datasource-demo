package com.xqcao.demo.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IdEntity {
    @Id
    @GeneratedValue
    Long id;
}
