package com.xqcao.demo.domain.one;

import com.xqcao.demo.domain.AuditEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class User extends AuditEntity {
    private String name;
    private Integer age;
}
