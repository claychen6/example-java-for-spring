package com.danke.app.uac;

import com.danke.app.uac.dao.*;
import com.danke.app.uac.service.*;
import com.danke.common.app.Handler;
import com.danke.common.app.ResponseConfig;
import com.danke.contract.uac.entity.User;
import com.danke.service.uac.UserController;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

//@EnableJpaAuditing // 启用审计
@EnableAutoConfiguration
@SpringBootConfiguration
@EntityScan(value = "com.danke.contract.uac.entity")
@ComponentScan(value = "com.danke.app.uac.dao", useDefaultFilters = true, basePackageClasses = UserRepository.class)
@ComponentScan(value = "com.danke.app.uac.service", useDefaultFilters = true, basePackageClasses = UserService.class)
@ComponentScan(value = "com.danke.service.uac", useDefaultFilters = true, basePackageClasses = UserController.class)
@ComponentScan(value = "com.danke.common.app", useDefaultFilters = true, basePackageClasses = Handler.class)
@ComponentScan(value = "com.danke.common.app", useDefaultFilters = true, basePackageClasses = ResponseConfig.class)
//@SpringBootApplication
@AutoConfigurationPackage
public class UacApplication {
    public static void main(String[] args) {
        SpringApplication.run(UacApplication.class, args);
    }
}
