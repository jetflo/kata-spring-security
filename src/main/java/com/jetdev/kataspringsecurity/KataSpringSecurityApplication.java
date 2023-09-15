package com.jetdev.kataspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class KataSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataSpringSecurityApplication.class, args);
    }

}
