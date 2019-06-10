package com.learnspring.javasourcecode.model;

import com.learnspring.javasourcecode.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice respiration!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
