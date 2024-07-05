package com.nvz.gl309_6_1_sp11_dependencyinjection.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Database Connection";
    }
}
