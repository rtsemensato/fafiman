package com.learnspring.javasourcecode.model;

import com.learnspring.javasourcecode.service.FortuneService;

public class VoleiCoach implements Coach {

    private FortuneService fortuneService;

    public VoleiCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice ball knock!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
