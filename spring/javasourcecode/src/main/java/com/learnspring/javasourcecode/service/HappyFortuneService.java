package com.learnspring.javasourcecode.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService {

    private Random random = new Random();

    private String[] data = {
        "Today is your lucky day!", "Be prepared to a great day!", "Everything you do today will be a successful stuff!"
    };

    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }

}
