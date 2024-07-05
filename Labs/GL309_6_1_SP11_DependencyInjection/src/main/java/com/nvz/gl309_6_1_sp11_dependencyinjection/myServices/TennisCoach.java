package com.nvz.gl309_6_1_sp11_dependencyinjection.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    //@Qualifier("randomFortuneService") // we use qualifier with the name of the specific implementation we want to use
    @Qualifier("databaseFortuneService")
    private FortuneServices fortuneService;

    public TennisCoach() {}

    // Autowired is used on a constructor to automatically wire this component based on the argument that is supplied to FortuneService
//    @Autowired
    public TennisCoach(FortuneServices theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
