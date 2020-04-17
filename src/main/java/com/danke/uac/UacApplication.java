package com.danke.uac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
@EnableJpaAuditing // 启用审计
public class UacApplication {

	public static void main(String[] args) {
		SpringApplication.run(UacApplication.class, args);
	}

}
