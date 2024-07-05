package com.nvz.gl309_6_1_sp11_dependencyinjection;

import com.nvz.gl309_6_1_sp11_dependencyinjection.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.nvz.gl309_6_1_sp11_dependencyinjection.myServices"})
public class Gl30961Sp11DependencyInjectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Gl30961Sp11DependencyInjectionApplication.class, args);

        // get the bean from spring container
        Coach theCoach = context.getBean(Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
//        SpringApplication.run(Gl30961Sp11DependencyInjectionApplication.class, args);
    }

}
