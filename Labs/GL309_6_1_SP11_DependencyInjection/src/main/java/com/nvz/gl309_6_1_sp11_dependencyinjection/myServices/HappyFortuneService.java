package com.nvz.gl309_6_1_sp11_dependencyinjection.myServices;

import org.springframework.stereotype.Component;


//using controller so that Spring can auto-scan and find an implementation for the Spring container
@Component
public class HappyFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
