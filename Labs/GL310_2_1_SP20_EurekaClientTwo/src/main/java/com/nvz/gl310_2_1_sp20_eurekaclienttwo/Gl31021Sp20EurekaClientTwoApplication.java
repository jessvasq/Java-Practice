package com.nvz.gl310_2_1_sp20_eurekaclienttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //with this annotation, the artifact will act like a Spring discovery client and will register itself in the Eureka server attached to this service
public class Gl31021Sp20EurekaClientTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gl31021Sp20EurekaClientTwoApplication.class, args);
    }

}
