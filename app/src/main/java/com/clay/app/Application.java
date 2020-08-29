package com.clay.app;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@EntityScan(basePackages = "com.clay.app.dto")
@EnableJpaRepositories(basePackages = "com.clay.app.dao")
@ComponentScan(basePackages = "com.clay.app.service")
@ComponentScan(basePackages = "com.clay.uac_simple_api")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
