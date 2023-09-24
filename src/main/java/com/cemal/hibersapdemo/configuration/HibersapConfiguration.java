package com.cemal.hibersapdemo.configuration;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.SessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibersapConfiguration {

    @Bean
    public SessionManager sessionManager() {
        AnnotationConfiguration configuration = new AnnotationConfiguration("TRQ");
        return configuration.buildSessionManager();
    }
}
