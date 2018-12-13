package com.xqcao.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class User extends AuditEntity {
    private String name;
    private Integer age;
}
