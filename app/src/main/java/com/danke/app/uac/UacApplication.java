package com.danke.app.uac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@EnableJpaAuditing // 启用审计
public class UacApplication {

	public static void main(String[] args) {
		SpringApplication.run(UacApplication.class, args);
	}

}
