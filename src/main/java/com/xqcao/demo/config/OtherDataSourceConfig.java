package com.xqcao.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = {"com.xqcao.demo.repository.other"},
        transactionManagerRef = "otherTransactionManager",
        entityManagerFactoryRef = "otherEntityManagerFactory"
)
public class OtherDataSourceConfig {

    @Bean
    @ConfigurationProperties("other.datasource")
    public DataSource otherDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate otherJdbcTemplate(@Qualifier("otherDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public EntityManager otherEntityManager(EntityManagerFactoryBuilder builder) {
        return otherEntityManagerFactory(builder).getObject().createEntityManager();
    }

    @Bean
    public PlatformTransactionManager otherTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(otherEntityManagerFactory(builder).getObject());
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean otherEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(otherDataSource())
                .packages("com.xqcao.demo.domain.other")
                .persistenceUnit("other")
                .build();
    }
}
