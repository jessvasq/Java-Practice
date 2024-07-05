package com.nvz.gl309_6_1_sp11_dependencyinjection.myServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneServices {
    private String[] data = {"Beware of the wolf in sheep's clothing",    "Diligence is the mother of good luck",
            "The journey is the reward"};

    //random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
