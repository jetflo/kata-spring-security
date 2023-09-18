package com.jetdev.kataspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@ConfigurationPropertiesScan
public class KataSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataSpringSecurityApplication.class, args);
    }

}
