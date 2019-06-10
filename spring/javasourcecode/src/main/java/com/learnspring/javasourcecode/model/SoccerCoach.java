package com.learnspring.javasourcecode.model;

import com.learnspring.javasourcecode.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice some goal shots!";
    }

    @Autowired
    @Qualifier("sadFortuneService")
    public void receiveFortuneFromOutside(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
