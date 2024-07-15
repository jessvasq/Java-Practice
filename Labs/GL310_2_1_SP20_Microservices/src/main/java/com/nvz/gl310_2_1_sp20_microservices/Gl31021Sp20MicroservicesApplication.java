package com.nvz.gl310_2_1_sp20_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //sets up a registry with which other applications can communicate
public class Gl31021Sp20MicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gl31021Sp20MicroservicesApplication.class, args);
    }

}
