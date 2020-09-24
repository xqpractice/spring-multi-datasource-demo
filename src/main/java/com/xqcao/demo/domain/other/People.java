package com.xqcao.demo.domain.other;

import com.xqcao.demo.domain.AuditEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "people")
public class People extends AuditEntity {
    private String name;
    private Integer age;
}
