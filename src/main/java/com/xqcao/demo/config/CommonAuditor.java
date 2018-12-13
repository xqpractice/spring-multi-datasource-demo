package com.xqcao.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class CommonAuditor implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        return "cxq";
    }
}
