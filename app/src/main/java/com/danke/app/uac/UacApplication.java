package com.danke.app.uac;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@EntityScan("com.danke.contract.uac.entity")
@EnableJpaRepositories(basePackages = "com.danke.app.uac.dao")
@ComponentScan(basePackages = "com.danke.app.uac.service")
@ComponentScan(basePackages = "com.danke.service.uac")
@ComponentScan(basePackages = "com.danke.common.app")
@SpringBootApplication
public class UacApplication {
    public static void main(String[] args) {
        SpringApplication.run(UacApplication.class, args);
    }
}
