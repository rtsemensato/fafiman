package com.learnspring.javasourcecode.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SadFortuneService implements FortuneService {

    private Random random = new Random();

    private String[] data = {
            "Today will be a piece of shit!", "You will be sic!", "You will die today!"
    };

    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }

}
